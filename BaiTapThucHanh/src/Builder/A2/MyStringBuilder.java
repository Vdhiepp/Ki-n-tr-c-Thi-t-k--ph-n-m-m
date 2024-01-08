package Builder.A2;

public class MyStringBuilder {
    String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder addString(String s){
        this.str += s;
        return this;
    }
    public MyStringBuilder addFloat(Float f){
        this.str += f;
        return this;
    }
    public MyStringBuilder addBool(Boolean b){
        this.str += b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
