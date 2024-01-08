package behavioral.iterator.ce2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    //Tạo ArrayList
    //Tạo một iterator từ ArrayList
    //Duyệt các phần tử của iterator
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(7);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
