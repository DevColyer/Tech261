package com.sparta.dc.decorator.sides;

import com.sparta.dc.decorator.Pizza;

public class GarlicBread extends Sides{
    public GarlicBread(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and garlic bread.";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10.0d;
    }
}
