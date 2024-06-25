package com.sparta.dc.decorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Johnny's Chicago Special";
    }

    @Override
    public double getCost() {
        return 15;
    }
}
