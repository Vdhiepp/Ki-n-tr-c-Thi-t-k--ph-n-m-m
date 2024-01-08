package behavioral.iterator.vidu;

public class ArrayIterator63 extends Iterator63{
    ArrayCollection63 array;
    int index = -1;
    protected ArrayIterator63(ArrayCollection63 array) {
        this.array = array;
    }

    @Override
    Object first() {
        if (array.count() > 0) {
            index = 0;
            return array.getItem(index);
        }
        return null;
    }

    @Override
    Object next() {
        if (!isDone())
            return array.getItem(++index);
        return null;
    }

    @Override
    boolean isDone() {
        return (index == array.count()-1);
    }

    @Override
    Object current() {
        if (index >= 0)
            return array.getItem(index);
        return null;
    }
}
