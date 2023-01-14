package org.packt.java17Fundamentals.Statements;

public class IterationStatements {

    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        do {
//            System.out.print(i + " ");
//            i++;
//        } while (i < 10);
//        i = 0;
//        System.out.println();
//
//        for(int x = 0, y = 0; x < 3 && y < 3; x++, y++) {
//            System.out.printf("%d %d\n", x, y);
//        }
//
//
//        for (int x = getInitialValue(), j = x == -2 ? x + 2 : 0,
//             k = 0; j < 3 || k < 3 ; ++j, k = j) {
//            System.out.println(j + " " + k);
//        }


        for (int i=20, j=-1; i < 23 && j < 0; ++i, ++j){
            System.out.println(i + " " + j + " ");
        }

    }

   static int getInitialValue() {
        return -2;
    }

}
