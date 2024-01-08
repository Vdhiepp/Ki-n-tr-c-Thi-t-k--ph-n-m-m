package bt_java_buoi_so_3.b3;

public abstract class AbstractFile {
    String name, ngayTao;
    String duongDan;

    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
        this.duongDan = name;
    }

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract String getStringTreeFolder();

    public String getPath() {
        return duongDan;
    }
}
