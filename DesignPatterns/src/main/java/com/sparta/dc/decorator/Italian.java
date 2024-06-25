package com.sparta.dc.decorator;

public class Italian extends Pizza {

    @Override
    public String getDescription() {
        return "Luigi's Pizzeria Special";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
