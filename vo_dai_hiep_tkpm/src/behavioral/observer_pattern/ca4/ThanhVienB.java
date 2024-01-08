package behavioral.observer_pattern.ca4;
import java.util.ArrayList;
import java.util.List;

//Observer
public class ThanhVienB implements Topic.TopicListener {
    List<Topic> list = new ArrayList<>();
    Topic t;

    public ThanhVienB(Topic t) {
        this.t = t;
        t.attach(this);
    }

    public void register(){
        t.attach(this);
    }

    @Override
    public void addNew(Topic t) {

    }

    @Override
    public void update(Topic t) {

    }
}
