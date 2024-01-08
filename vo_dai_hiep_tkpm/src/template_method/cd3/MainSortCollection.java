package template_method.cd3;

import java.util.ArrayList;
import java.util.List;

public class MainSortCollection {
    public static void main(String[] args) {
        //1. Tạo một SortCollection
        SortCollection<Product> sort = new SortProductByName();
        //2. Tạo một List<Product>
        List<Product> list = new ArrayList<>();
        //3. Sử dụng SortCollection để sắp xếp
        sort.sort(list);
        //4.In danh sách ra màn hình để kiểm tra
        Product p1 = new Product("Ao", 30000, 5);
        Product p2 = new Product("Quan", 50000, 5);
        Product p3 = new Product("Ao thun", 15000, 3);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        printf(list);
        sort.sort(list);
        printf(list);
    }
    public static void printf(List<Product> list){
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
