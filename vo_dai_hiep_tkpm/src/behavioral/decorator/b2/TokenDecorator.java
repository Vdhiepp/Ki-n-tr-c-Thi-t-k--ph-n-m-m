package behavioral.decorator.b2;

public class TokenDecorator implements ITokennize{
    ITokennize tokennize;

    public TokenDecorator(ITokennize tokennize){
        this.tokennize = tokennize;
    }

    @Override
    public String[] tokenize() {
        return tokennize.tokenize();
    }
}
