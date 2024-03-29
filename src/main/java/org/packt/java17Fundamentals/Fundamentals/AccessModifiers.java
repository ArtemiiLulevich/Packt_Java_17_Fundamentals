package org.packt.java17Fundamentals.Fundamentals;

import java.util.Objects;

public class AccessModifiers {

    String prop1;
    private String prop2;
    protected String prop3;
    public String prop4;

    void method1() {
    }

    private void method2() {
    }

    protected void method3() {
    }

    public void method4() {
    }

    class A1 {
    }

    private class A2 {
    }

    protected class A3 {
    }

    public class A4 {
    }

    interface I1 {
    }

    private interface I2 {
    }

    protected interface I3 {
    }

    public interface I4 {
    }

    private String topLevelPrivateProperty = "Top-level private value";

    private void topLevelPrivateMethod() {
        var inner = new InnerClass();
        System.out.println(inner.innerPrivateProperty);
        inner.innerPrivateMethod();
    }

    private class InnerClass {
//        private static String PROP = "Inner static"; //error
        private String innerPrivateProperty = "Inner private value";

        private void innerPrivateMethod() {
            System.out.println(topLevelPrivateProperty);
        }

    }

    private static class InnerStaticClass {
        private static String PROP = "Inner private static";
        private String innerPrivateProperty = "Inner private value";

        private void innerPrivateMethod() {
            var top = new AccessModifiers();
            System.out.println(top.topLevelPrivateProperty);
        }
    }

    public static void main(String[] args) {
        var top = new AccessModifiers();
        top.topLevelPrivateMethod();
//        var inner = new InnerClass(); //compiler error
        System.out.println(InnerStaticClass.PROP);
        var innerStatic = new InnerStaticClass();
        System.out.println(innerStatic.innerPrivateProperty);
        innerStatic.innerPrivateMethod();
    }
}
