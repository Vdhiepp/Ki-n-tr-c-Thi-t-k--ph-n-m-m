package behavioral.decorator.b2;

import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    List<Character> dauCau = Arrays.asList('.',',',';',':','!','?');
    public LoaiBoDauCau(ITokennize tokennize) {
        super(tokennize);
    }

    @Override
    public String[] tokenize() {
        //lay thanh phan xu ly cua phia truoc
        String[] tu = super.tokenize();

        for (int i = 0; i < tu.length; i++){
            if (dauCau.contains(tu[i].toCharArray()[tu[i].length()-1]))
                tu[i] = tu[i].substring(0, tu[i].length()-1);
        }
        return tu;
    }
}
