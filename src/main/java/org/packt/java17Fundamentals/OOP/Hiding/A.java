package org.packt.java17Fundamentals.OOP.Hiding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public interface A {

    String BLA = getPro("blavla");
    String X = getPro("x");



    private static String getPro(String name) {

        try {
            Properties appProps = new Properties();
            appProps.load(new FileInputStream("sdflshgd"));
            return appProps.getProperty(name);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    String NAME = "interface A";
    static void method() {
        System.out.println("Int A");
    }

}
