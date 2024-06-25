package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    int houseNo = 0;
    String street = "";
    String town = "";

    public Address() {
        this.houseNo = 0;
        this.street = "";
        this.town = "";
    }

    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    public boolean isEmpty() {
        return houseNo == 0 && street.isEmpty() && town.isEmpty();
    }

    @Override
    public String toString() {

        if (isEmpty()) return "Address: <no address set>";

        return "Address: " + houseNo + " " + street + ", " + town;
    }
}