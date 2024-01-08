package behavioral.observer_pattern.ca4_2;

import java.util.ArrayList;
import java.util.List;

//Obverser
public class ThanhVienB implements Topic.TopicObserver {
    Topic t;
    List<Tin> list = new ArrayList<>();

    public ThanhVienB(Topic t) {
        this.t = t;
        t.dangKy(this);
    }

    @Override
    public void tinMoi(Tin t) {
        list.add(0, t);
        System.out.println("TVB tin mới: ");
        for (Tin tin : list){
            System.out.println("id: " + tin.id);
            System.out.println("Nội dung: " + tin.noiDung);
        }
    }

    @Override
    public void capNhat(Tin t) {
        for (Tin tin:  list){
            if (t.id == tin.id)
                tin.noiDung = t.noiDung;
            System.out.println("TVB cập nhật: ");
            System.out.println("id: " + tin.id);
            System.out.println("Nội dung: " + tin.noiDung);
            break;
        }
    }
}
