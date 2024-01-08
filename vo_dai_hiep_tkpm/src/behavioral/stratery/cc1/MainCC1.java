package behavioral.stratery.cc1;

public class MainCC1 {
    public static void main(String[] args) {
        Context context = new Context();
        context.setTinhtoan(new Cong());
        System.out.println("75 + 12 = " + context.tinh(75,12));

        Context context1 = new Context();
        context1.setTinhtoan(new Tru());
        System.out.println("54 - 78 = " + context1.tinh(54,78));
    }
}
