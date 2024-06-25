package com.sparta.dc.factory;

public class AnimalFactory {
    public static Speakable getAnimal(String animal){
        return switch (animal) {
            case "Bear" -> new Bear();
            case "John" -> new John();
            case "Raccoon" -> new Raccoon();
            default -> null;
        };
    }
}
