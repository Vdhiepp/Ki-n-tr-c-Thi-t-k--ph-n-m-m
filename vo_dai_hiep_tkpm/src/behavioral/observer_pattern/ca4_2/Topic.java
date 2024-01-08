package behavioral.observer_pattern.ca4_2;

import java.util.ArrayList;
import java.util.List;

//Subject
public class Topic {
    List<TopicObserver> observers = new ArrayList<>();
    List<Tin> list = new ArrayList<>();
    public void dangKy(TopicObserver observer){
        observers.add(observer);
    }

    public void huyDangKy(TopicObserver observer){
        observers.remove(observer);
    }

    public void tinMoi(Tin t){
        list.add(t);
        for(TopicObserver o: observers){
            o.tinMoi(t);
        }
    }

    public void capNhat(Tin t){
        for (Tin tin: list){
            if (tin.id == t.id){
                tin.noiDung = t.noiDung;
                for (TopicObserver o : observers)
                    o.capNhat(t);
                break;
            }
        }
    }

    public static interface TopicObserver{
        void tinMoi(Tin t);
        void capNhat(Tin t);
    }
}
