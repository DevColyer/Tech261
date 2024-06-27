package com.sparta.dc;

public class App {
    public static void main(String[] args) {
        IntegerRect myIntRect = new IntegerRect(2, 4);
        System.out.printf("myIntRect Area: %d\n", myIntRect.getHeight() * myIntRect.getWidth());
        DoubleRect myDoubleRect = new DoubleRect(2.5, 4.5);
        System.out.printf("myDoubleRect Area: %f\n", myDoubleRect.getHeight() * myDoubleRect.getWidth());

        GenericRect<? extends Integer> myGenericIntRect = new GenericRect<>(2, 4);
        System.out.printf("myGenericIntRect Area: %d\n", myGenericIntRect.getHeight() * myGenericIntRect.getWidth());
        GenericRect<Double> myGenericDoubleRect = new GenericRect<>(2.5, 4.5);
        System.out.printf("myGenericDoubleRect Area: %f\n", myGenericDoubleRect.getHeight() * myGenericDoubleRect.getWidth());

    }
}
