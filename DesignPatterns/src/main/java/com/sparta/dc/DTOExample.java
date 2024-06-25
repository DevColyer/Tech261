package com.sparta.dc;

import java.time.LocalDate;

public record DTOExample(String name, Integer number, LocalDate creationDate) {
    @Override
    public String toString() {
        return name + "\n"
                + number + "\n"
                + creationDate + "\n";
    }
}
