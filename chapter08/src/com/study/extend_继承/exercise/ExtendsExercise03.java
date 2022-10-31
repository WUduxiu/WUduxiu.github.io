package com.study.extend_继承.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IMB");
        pc.printInfo();
    }
}
class Computer {
    private String CPU;
    private int memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetails(){
        return "cpu="+CPU+" memory="+memory+" disk="+disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}






