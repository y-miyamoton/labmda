package chap04.labmda07_BinaryOperator;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        displayCalc((a, b) -> a + b);
        displayCalc((a, b) -> a - b);
    }

    private static void displayCalc(BinaryOperator<Integer> bo) {

        int a = 7;
        int b = 2;

        int result = bo.apply(a, b);

        System.out.println(result);
    }
}
