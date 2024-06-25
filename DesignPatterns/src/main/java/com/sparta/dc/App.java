package com.sparta.dc;

import com.sparta.dc.decorator.Italian;
import com.sparta.dc.decorator.sides.GarlicBread;
import com.sparta.dc.singleton.SingletonExample;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost:" + italian.getCost());

        GarlicBread garlicBread = new GarlicBread(italian);
        System.out.println(garlicBread.getDescription() + " Cost:" + garlicBread.getCost());
    }
}
