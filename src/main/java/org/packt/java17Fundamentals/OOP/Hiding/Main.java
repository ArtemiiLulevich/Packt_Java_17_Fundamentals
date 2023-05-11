package org.packt.java17Fundamentals.OOP.Hiding;

import org.packt.java17Fundamentals.OOP.Interfaces.SomeClass;

public class Main {

    public static void main(String[] args) {
//        System.out.println(B.NAME);
//        B.method();
//
//        System.out.println(A.NAME);
//        A.method();
//
//        System.out.println(D.NAME);
//        D.method();
        C obj = new D();

        System.out.println(obj.NAME);
        System.out.println(((D) obj).NAME);

        obj.method();
        ((D)obj).method();

        System.out.println(obj.name1);
        System.out.println(((D)obj).name1);
    }

}
