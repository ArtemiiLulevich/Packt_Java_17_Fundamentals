package org.packt.java17Fundamentals.OOP.RecordClass;

public class RecordClasses {

    public static void main(String[] args) {
        record Person(int age, String name) {

        }

        Person Yula = new Person(28, "Yula");

        System.out.println(Yula.name);
        System.out.println(Yula.age);
        System.out.println(Yula);

    }
}
