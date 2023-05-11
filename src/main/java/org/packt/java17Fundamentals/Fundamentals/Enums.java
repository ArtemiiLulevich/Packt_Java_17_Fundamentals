package org.packt.java17Fundamentals.Fundamentals;

import java.time.DayOfWeek;

public class Enums {
    enum Season {
        SPRING(33, ""),
        SUMMER(23, ""),
        AUTUMN(22, ""),
        WINTER(11, "January");

        private int temp;
        private String month;

        Season(int temp, String month) {
            this.temp = temp;
            this.month = month;
        }

        public int getTemp() {
            return this.temp;
        }

        public String getMonth() {
            return this.month;
        }
//
//        @Override
//        public String toString() {
//            return this.name() + " " + getTemp();
//        }
    }

    public static void main(String[] args) {
//        for (Season season:
//             Season.values()) {
//            System.out.println(season);
//        }

        System.out.println(Season.AUTUMN.name());

        System.out.println(Season.AUTUMN.ordinal());

        System.out.println(Season.WINTER.month);
        System.out.println(DayOfWeek.FRIDAY.toString());
    }

}
