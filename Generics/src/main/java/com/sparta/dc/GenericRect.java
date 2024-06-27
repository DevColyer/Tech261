package com.sparta.dc;

public class GenericRect<T extends Number> {
    private T width;
    private T height;

    public GenericRect(T width, T height) {
        this.width = width;
        this.height = height;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public static <V extends Integer> void printToConsole(V value){
        System.out.println();
    }
}
