package behavioral.observer_pattern.ca1_stop;

import java.util.List;

public class MyClient implements MyStream.MyStreamListener<List<MonHoc>> {

    public MyClient(MyStream<List<MonHoc>> myStream) {
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        //in danh sach mon hoc ra man hinh

    }
}
