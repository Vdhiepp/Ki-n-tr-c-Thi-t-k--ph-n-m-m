package behavioral.iterator.vidu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void hienThi(Iterator iterator){
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
        hienThi(list.iterator());
        System.out.println("=================================");

        System.out.println("My Iterator: ");

        ArrayCollection63 collection63 = new ArrayCollection63();
        Iterator63 iterator63 = collection63.createIterator();
        while (!iterator63.isDone())
            System.out.println(iterator63.next());
    }
}
