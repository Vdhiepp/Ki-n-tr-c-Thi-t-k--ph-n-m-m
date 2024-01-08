package creational.singleton.a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static final Dictionary<String, DataAccessUpgrade> dataAccess = new Hashtable<>();
    List<String> dsSP = new ArrayList<>();
    public static DataAccessUpgrade getInstance(String tag){
        if (dataAccess.get(tag) == null){
            DataAccessUpgrade d = new DataAccessUpgrade();
            dataAccess.put(tag,d);
        }
        return dataAccess.get(tag);//Singleton cho một tập hợp đối tượng
    }
    public void add(String s){
        dsSP.add(s);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String s: dsSP){
            builder.append(s).append("\n");
        }
        return builder.toString();
    }
}
