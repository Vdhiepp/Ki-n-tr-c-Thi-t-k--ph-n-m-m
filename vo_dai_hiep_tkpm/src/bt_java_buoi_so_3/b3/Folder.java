package bt_java_buoi_so_3.b3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> list = new ArrayList<>();

    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void add(AbstractFile file) {
        if (!list.contains(file)) {
            list.add(file);
            // file.duongDan = file.name
            file.duongDan = this.duongDan + "\\" + file.duongDan;
        }
    }

    @Override
    public void remove(AbstractFile file) {
        if (list.contains(file)) {
            list.remove(file);
            return;
        }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append("\t").append(name);

        for (AbstractFile f : list) {
            builder.append("\n\t").append(f.getStringTreeFolder());
        }

        return builder.toString();
    }
}
