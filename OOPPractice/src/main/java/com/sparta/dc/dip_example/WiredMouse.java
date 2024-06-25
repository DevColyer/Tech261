package com.sparta.dc.dip_example;

public abstract class WiredMouse implements Mouse {

    @Override
    public void leftClick(){
        System.out.println("Left-click on a wired mouse.");
    }

    @Override
    public void rightClick(){
        System.out.println("Right-click on a wired mouse.");
    }
}
