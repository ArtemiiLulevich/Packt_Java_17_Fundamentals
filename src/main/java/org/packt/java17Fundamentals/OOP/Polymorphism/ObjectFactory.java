//package org.packt.java17Fundamentals.OOP.Polymorphism;
//
//public class ObjectFactory {
//    public static void main(String[] args) {
//
//        var s = 2;
//        CalcSomething calc = CalcFactory.getCalculator();
//        double result = calc.calculate();
//    }
//
//    interface CalcSomething{
//        double calculate();
//    }
//
//    static class CalcUsingAlg1 implements CalcSomething {
//
//        @Override
//        public double calculate() {
//            return 42;
//        }
//    }
//
//    static class CalcUsingAlg2 implements CalcSomething {
//        private int prop1;
//        private double prop2;
//
//        public CalcUsingAlg2(int prop1, double prop2) {
//            this.prop1 = prop1;
//            this.prop2 = prop2;
//        }
//
//        @Override
//        public double calculate() {
//            return prop1 * prop2;
//        }
//    }
//
//    static class CalcFactory {
//        public static CalcSomething getCalculator() {
//            String alg = getAlgValueFromFile();
//            switch (alg) {
//                case "1":
//                    return new CalcUsingAlg1();
//                case "2":
//                    int p1 = getAlg2PropFile();
//                    double p2 = getAlg2PropFile();
//                    return new CalcUsingAlg2(p1, p2);
//                default:
//                    System.out.println("Unknown value " + alg);
//                    return new CalcUsingAlg1();
//            }
//
//        }
//    }
//
//
//}
