package bt_java_buoi_so_3.b3;

public class File extends AbstractFile{
    public File(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public void add(AbstractFile file) {
    }

    @Override
    public void remove(AbstractFile file) {
    }

    @Override
    public String getStringTreeFolder() {
        return name;
    }
}
