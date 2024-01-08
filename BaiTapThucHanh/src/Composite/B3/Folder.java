package Composite.B3;

import java.util.ArrayList;
import java.util.List;

import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class Folder implements IFileSystem{
    String name;
    List<IFileSystem> children = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPath() {
        if (parent == null) {
            return name; // Nếu không có thư mục cha (nghĩa là đây là thư mục gốc)
        } else {
            return parent.getPath() + "/" + name;
        }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder tree = new StringBuilder();
        tree.append(name).append(System.lineSeparator()); // Hiển thị tên thư mục

        for (IFileSystem component : children) {
            if (component instanceof Folder) {
                // Nếu là thư mục, thêm các khoảng trắng thụ động để tạo cấu trúc cây
                tree.append("|-- ");
                tree.append(((Folder) component).getStringTreeFolder().replace("\n", "\n|   "));
            } else if (component instanceof File) {
                // Nếu là tập tin, hiển thị tên tập tin
                tree.append("|-- ").append(component.getName()).append(System.lineSeparator());
            }
        }

        return tree.toString();
    }

    @Override
    public void addItem(IFileSystem component) {
        children.add(component);
    }

    @Override
    public void removeItem(IFileSystem component) {
        children.remove(component);
    }
}
