package behavioral.observer_pattern.ca1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<IStreamListener> observers = new ArrayList<>();
    public void addListener(IStreamListener listener){
        observers.add(listener);
    }
    public void addEvent(T t){
        for (IStreamListener listener : observers){
            listener.listen(t);
        }
    }
    public static interface IStreamListener<T>{
        void listen(T t);
    }
}
