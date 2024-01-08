package Composite.B3;

public interface IFileSystem {
    String getName();
    String getPath();
    String getStringTreeFolder();
    void addItem(IFileSystem component);
    void removeItem(IFileSystem component);

}
