package structural.composite.b6;

public interface IComponent {
    void duyetCay();
    void addLeft(IComponent component);
    void addRight(IComponent component);
    void remove(IComponent component);
}
