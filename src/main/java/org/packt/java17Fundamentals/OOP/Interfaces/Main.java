package org.packt.java17Fundamentals.OOP.Interfaces;

public class Main {

    public static void main(String[] args) {
        SomeInterface myClass = new SomeClass();

        myClass.printName();
//        myClass.printNameLastName();
        myClass.age();

        interface C {}
        interface B extends C {}
        class A implements B { }
        B b = new A();
        C c = new A();
        A a1 = (A) b;
        A a2 = (A) c;

    }

}
