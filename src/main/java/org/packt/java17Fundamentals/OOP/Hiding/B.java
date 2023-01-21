package org.packt.java17Fundamentals.OOP.Hiding;

public interface B extends A{

    String NAME = "Interface B";

    static void method() {
        System.out.println("Int B");
    }

}
