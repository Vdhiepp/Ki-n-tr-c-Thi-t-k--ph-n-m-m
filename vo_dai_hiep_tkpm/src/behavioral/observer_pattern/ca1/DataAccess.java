package behavioral.observer_pattern.ca1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataAccess {
    List<MonHoc> monHocs = new ArrayList<>();
    MyStream<List<MonHoc>> myStream;

    public DataAccess(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
    }

    public void add(MonHoc m){
        monHocs.add(m);
        myStream.addEvent(monHocs);
    }

    public void remove(String maMH){
        MonHoc m = null;
        for (MonHoc mh : monHocs)
            if (mh.maMH.equals(maMH)){
                m = mh;
                break;
            }
        if (m != null){
            monHocs.remove(m);
            myStream.addEvent(monHocs);
        }

//        monHocs.removeIf(monHoc -> Objects.equals(monHoc.getMaMH(), maMH));
//        myStream.addEvent(monHocs);
    }
}
