package chap04.labmda05_UnaryOperator;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        process(n -> n * 2);
    }

    static void process(UnaryOperator<Integer> uo) {

        int value = 7;

        int result = uo.apply(value);

        System.out.println(result);
    }
}
