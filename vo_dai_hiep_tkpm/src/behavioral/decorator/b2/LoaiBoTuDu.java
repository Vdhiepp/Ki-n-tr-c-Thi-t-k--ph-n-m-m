package behavioral.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDu extends TokenDecorator{
    //List<String> tuDung = Arrays.asList("và","hoặc","thì","mà","là");
    String[] dsTuDung = new String[]{"và","hoặc","thì","mà","là"};
    public LoaiBoTuDu(ITokennize tokennize) {
        super(tokennize);
    }

    @Override
    public String[] tokenize() {
        //lay thanh phan xu ly cua phia truoc
        //String[] tu = super.tokenize();
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.tokenize()));

        dsTu.removeAll(Arrays.asList(dsTuDung));
        return dsTu.toArray(new String[0]);
    }
}
