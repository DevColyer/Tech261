package com.sparta.dc.dip_example;

public class App {
    public static void main(String[] args) {
        Computer myComputer1 = new Computer(new MiniKeyboard(), new WirelessOpticalMouse());
        myComputer1.useKeyboard();
        myComputer1.useLMB();
        myComputer1.useRMB();

        System.out.println("\n");
        Computer myComputer2 = new Computer(new MechanicalKeyboard(), new WiredMechanicalMouse());
        myComputer2.useKeyboard();
        myComputer2.useLMB();
        myComputer2.useRMB();

        System.out.println("\n");
        Computer myComputer3 = new Computer(new MembraneKeyboard(), new WiredOpticalMouse());
        myComputer3.useKeyboard();
        myComputer3.useLMB();
        myComputer3.useRMB();
    }
}
