package behavioral.singleton.a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccess632 {
    private static DataAccess632 instance;
    List<SanPham> list = new ArrayList<>();
    private DataAccess632(){
    }
    public static DataAccess632 getInstance(){
        if (instance == null)
            instance = new DataAccess632();
        return instance;
    }
    public void them(SanPham sp){
        list.add(sp);
    }
    public void xoa(SanPham sp){
        list.remove(sp);
    }

    //Singleton cho nhieu doi tuong
    private static Dictionary<String, DataAccess632> dataPool = new Hashtable<>();
                //ten lop truu tuong < key, kieu du lieu > dataPool = new lop thuc thi
    public static DataAccess632 getInstance(String tag){
        if (dataPool.get(tag) == null){
            DataAccess632 data = new DataAccess632();
            dataPool.put(tag, data);
        }
        return dataPool.get(tag);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (SanPham s: list){
            builder.append(s).append("\n");
        }
        return builder.toString();
    }
}
