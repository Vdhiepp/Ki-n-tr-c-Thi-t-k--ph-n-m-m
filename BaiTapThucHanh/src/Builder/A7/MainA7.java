package Builder.A7;

public class MainA7 {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Ultra core 1500K")
                .addRAM("Kingston Fury 64GB")
                .addHardDisk("2TB Samsung Evo NVMe")
                .addScreen("27 inch 8k LG 100% RGB")
                .build();
        System.out.println(computer.toString());
    }
}
