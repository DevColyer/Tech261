package com.sparta.dc;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;

    public Spartan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        return(obj instanceof Spartan otherSpartan) // same type?
                && getFirstName().equals(otherSpartan.getFirstName()) // same data?
                && getLastName().equals(otherSpartan.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}