package behavioral.observer_pattern.ca1_stop;

import java.util.ArrayList;
import java.util.List;

public class MyDataAccess {
    List<MonHoc> monHocs = new ArrayList<>();
    MyStream<List<MonHoc>> myStream;

    public MyDataAccess(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
    }
    public void add(MonHoc m){
        monHocs.add(m);
        myStream.addClient(monHocs);
    }
}
