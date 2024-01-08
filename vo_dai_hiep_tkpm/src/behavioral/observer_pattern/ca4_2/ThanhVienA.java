package behavioral.observer_pattern.ca4_2;

//Observer
public class ThanhVienA implements Topic.TopicObserver {
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        t.dangKy(this);
    }

    @Override
    public void tinMoi(Tin t) {
        System.out.println("TVA tin mới");
        System.out.println("id: " + t.id);
        System.out.println("Nội dung: " + t.noiDung);
    }

    @Override
    public void capNhat(Tin t) {
        System.out.println("TVA vừa cập nhật");
        System.out.println("id: " + t.id);
        System.out.println("Nội dung: " + t.noiDung);
    }
}
