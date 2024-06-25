package com.sparta.dc.dip_example;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void useKeyboard() {
        keyboard.type();
    }
    public void useLMB() {
        mouse.leftClick();
    }
    public void useRMB() {
        mouse.rightClick();
    }
}
