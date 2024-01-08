package creational.singleton.a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> list = new ArrayList<>();

    private DataAccess() {
    }
    public static DataAccess getInstance(){
        if (instance == null)
            instance = new DataAccess();
        return instance;
    }
    public void them(SanPham sp){
        list.add(sp);
    }
    public void print(){
        System.out.println("Danh sách sản phẩm: ");

    }
}
