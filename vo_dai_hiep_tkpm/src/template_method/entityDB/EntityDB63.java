package template_method.entityDB;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB63<T> {
    List<T> list = new ArrayList<>();
    protected abstract int getID(T t);//phương thức được phụ thuộc ủy quyền cho lớp con cài đặt

    public boolean add(T t){ //template
        for (T o: list)
            if (getID(o)==getID(t))
                return false;
        list.add(t);
        return true;
    }
    public int update(T t){ //template
        for (int i = 0; i<list.size(); i++)
            if (getID(t)==getID(list.get(i))) {
                list.set(i, t);
                return 1;
            }
        return 0;
    }
    public int delete(T t){ //template
        /*for (T o:list)
            if (getID(o)==getID(t)) {
                list.remove(o);
                return 1;
            }
        return 0;*/
        //hoặc dùng bên dưới nếu giống nhau
        return deleteById(getID(t));
    }
    public int deleteById(int id){ //template
        for (T o:list)
            if (getID(o)==id) {
                list.remove(o);
                return 1;
            }
        return 0;
    }
    public void printInfo(){
        for (T t: list)
            System.out.println(t.toString());
    }
}
