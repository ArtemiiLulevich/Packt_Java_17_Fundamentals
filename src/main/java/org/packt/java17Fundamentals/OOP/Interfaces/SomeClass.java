package org.packt.java17Fundamentals.OOP.Interfaces;

public class SomeClass implements SomeInterface, SomeInterface2{

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printLastName() {
        System.out.println(lastName);
    }
}
