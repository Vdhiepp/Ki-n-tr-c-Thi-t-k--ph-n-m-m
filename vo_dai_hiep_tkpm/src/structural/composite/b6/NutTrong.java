package structural.composite.b6;

import java.util.ArrayList;
import java.util.List;

public class NutTrong implements IComponent{
    List<IComponent> list = new ArrayList<>();

    @Override
    public void duyetCay() {

    }

    @Override
    public void addLeft(IComponent component) {

    }

    @Override
    public void addRight(IComponent component) {

    }

    @Override
    public void remove(IComponent component) {
        list.remove(component);
    }
}
