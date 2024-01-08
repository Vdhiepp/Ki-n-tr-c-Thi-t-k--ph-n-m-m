package behavioral.decorator.b2;

import java.util.Arrays;

public class MainTokennize {
    public static void hienThi(String[] cacTu){
        Arrays.stream(cacTu).forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        ITokennize tachTu = new TachTu("Bạn Quốc tưởng hôm nay Live Stream hoặc mưa, nên ở nhà chờ coi và nghỉ học!");
        System.out.println("\nTách từ: ");
        hienThi(tachTu.tokenize());

        System.out.println("\nTách dấu câu: ");
        ITokennize boDau = new LoaiBoDauCau(tachTu);
        hienThi(boDau.tokenize());

        System.out.println("\nBỏ từ dừng: ");
        ITokennize boTu = new LoaiBoTuDu(boDau);
        hienThi(boTu.tokenize());
    }
}
