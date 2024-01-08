package Builder.A2;

public class MainA2 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("");
        myStringBuilder.addString("Hello ").addString("world! ").addFloat(3.123f).addString(" is a number. ").addBool(true);

        String result = myStringBuilder.toString();
        System.out.println(result);
    }
}
