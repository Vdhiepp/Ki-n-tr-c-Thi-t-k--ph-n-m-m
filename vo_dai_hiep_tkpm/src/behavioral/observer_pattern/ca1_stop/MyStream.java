package behavioral.observer_pattern.ca1_stop;

import java.util.ArrayList;
import java.util.List;

//Subject :có dữ liệu thông báo cho thành phần khác, chuyển dữ liệu T cho thành phần client
public class MyStream<T> {
    private List<MyStreamListener> observer = new ArrayList<>();

    public void addListener(MyStreamListener listener){
        observer.add(listener);
    }

    public void addClient(T t){
        for (MyStreamListener listener : observer){
            listener.listen(t);
        }
    }

    //Observer
    public static interface MyStreamListener<T>{
        void listen(T t);
    }

}
