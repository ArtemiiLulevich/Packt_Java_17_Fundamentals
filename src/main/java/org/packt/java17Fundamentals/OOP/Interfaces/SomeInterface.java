package org.packt.java17Fundamentals.OOP.Interfaces;

sealed interface SomeInterface permits SomeClass {
    String name = "Artem";
    void printName();

    default void age() {
        System.out.println(27);
    }
}
