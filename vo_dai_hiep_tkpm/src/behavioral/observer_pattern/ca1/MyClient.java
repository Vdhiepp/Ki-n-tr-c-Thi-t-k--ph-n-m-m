package behavioral.observer_pattern.ca1;

import java.util.List;

public class MyClient implements MyStream.IStreamListener<List<MonHoc>> {
    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println("\nSo luong mon hoc: " + monHocs.size());
        for (MonHoc m : monHocs){
            System.out.println(m.toString());
        }
    }
}
