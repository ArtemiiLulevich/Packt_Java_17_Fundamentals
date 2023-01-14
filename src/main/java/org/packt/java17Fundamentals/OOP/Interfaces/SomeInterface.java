package org.packt.java17Fundamentals.OOP.Interfaces;

public interface SomeInterface{
    String name = "Artem";
    void printName();

    default void age() {
        System.out.println(27);
    }
}
