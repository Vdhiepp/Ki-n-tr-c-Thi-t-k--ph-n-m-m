package behavioral.iterator.ce3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {
    public static void inDSMonHoc(Iterator<MonHoc> iterator){
        while (iterator.hasNext()){
            MonHoc m = iterator.next();
            System.out.println("Tên môn học: " + m.tenMH);
            System.out.println("Số tín chỉ: " + m.soTC + "\n");
        }
    }

//    public static void duyetDSMH(Iterator<MonHoc> iterator, Consumer<MonHoc> consumer){
//        while (iterator.hasNext()){
//            MonHoc m = iterator.next();
//            consumer.accept(m);
//        }
//    }
    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>();
        list.add(new MonHoc("Toán", 3));
        list.add(new MonHoc("Văn", 3));
        list.add(new MonHoc("Lịch sử", 2));
        list.add(new MonHoc("Kỹ năng sống", 4));
        list.add(new MonHoc("Kỹ năng mềm", 2));
        inDSMonHoc(list.iterator());

//        System.out.println("Cách 2:");
//        duyetDSMH(list.iterator(), new Consumer<MonHoc>() {
//            @Override
//            public void accept(MonHoc m) {
//                System.out.println("Tên môn học: " + m.tenMH);
//                System.out.println("Số tín chỉ: " + m.soTC + "\n");
//            }
//        });
    }
}
