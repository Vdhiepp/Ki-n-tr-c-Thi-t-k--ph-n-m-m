package Composite.B3;

import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class File implements IFileSystem{
    String name;

    public File(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
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
        return name;
    }

    @Override
    public void addItem(IFileSystem component) {

    }

    @Override
    public void removeItem(IFileSystem component) {

    }
}
