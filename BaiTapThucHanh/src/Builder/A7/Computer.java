package Builder.A7;

import Builder.A5.Book;

public class Computer {
    String cpu, ram, screen, hardDisk;

    @Override
    public String toString() {
        return "Computer: " +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", storage='" + hardDisk + '\'' +
                ", screen='" + screen + '\'';
    }
    public Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.screen = builder.screen;
        this.hardDisk = builder.hardDisk;
    }
    public static class Builder{
        String cpu, ram, screen, hardDisk;
        public Builder addCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.ram = ram;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder addHardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
