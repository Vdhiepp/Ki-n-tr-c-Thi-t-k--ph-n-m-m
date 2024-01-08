package behavioral.observer_pattern.ca1;

import java.util.List;

public class MainMyStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        MyClient client = new MyClient(stream);
        dataAccess.add(new MonHoc("001", "Lich su", 3));
        dataAccess.add(new MonHoc("002", "Dia Ly", 2));
        dataAccess.add(new MonHoc("003", "GDCD", 1));
        dataAccess.add(new MonHoc("004", "Tieng Anh", 4));

        dataAccess.remove("004");
        dataAccess.remove("002");
    }
}
