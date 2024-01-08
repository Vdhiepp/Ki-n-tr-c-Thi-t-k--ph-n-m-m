package behavioral.observer_pattern.ca4;
import java.util.ArrayList;
import java.util.List;

//Subject
public class Topic {
    List<Topic> topics = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();

    public void attach(TopicListener t){
        listeners.add(t);
    }

    public void detach(TopicListener t){
        listeners.remove(t);
    }

    public void add(int id, String content){

    }

    public void update(int id, String content){

    }

    public static interface TopicListener{
        void addNew(Topic t);
        void update(Topic t);
    }
}
