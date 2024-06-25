package com.sparta.pcw.codesmellsrefactoring;

// Class to represent a Person
public class Person {
    private final String firstName;
    private final String lastName;
    private Address address;
    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address();
    }

    public Person(String firstName, String lastName, Address address) {
        this(firstName, lastName);
        this.address = address;
    }

    public Person(String firstName, String lastName, int houseNo, String street, String town) {
        this(firstName, lastName, new Address(houseNo, street, town));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";
    }

    @Override
    public String toString() {
        return String.format("%s Name: %s  %s Age: %s. %s", super.toString(), firstName, lastName, age, address.toString());
    }
}