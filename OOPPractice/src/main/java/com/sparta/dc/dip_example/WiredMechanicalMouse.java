package com.sparta.dc.dip_example;

public class WiredMechanicalMouse extends WiredMouse {

    @Override
    public void leftClick(){
        System.out.println("Left-click on a wired mouse from 1992.");
    }

    @Override
    public void rightClick(){
        System.out.println("Right-click on a wired mouse from 1992.");
    }
}
