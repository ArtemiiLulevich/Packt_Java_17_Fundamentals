package org.packt.java17Fundamentals.Statements;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");


        String name = "Rex";

        String name_2 = new String("rex");

        name_2 = name_2.intern();

        String name_3 = "rex";

        System.out.println(name_3 == name_2);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println((b1 & b2) + " " + (b1 && b2));
        System.out.println("A".repeat(3).lastIndexOf("A"));

        int __ = 2;

        for (int i=20, j=-1; i < 23 && j < 4; ++i, ++j){
            System.out.println(i + " " + j + " ");
        }

        int x = 10;
        try {
            if(x++ > 10){
                throw new RuntimeException("The x value is out of the range: " + x);
            }
            System.out.println("The x value is within the range: " + x);
        } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
        }

        int i = 0;
        System.out.println(i++);

        System.out.println("A".repeat(3).lastIndexOf("A"));
    }
}