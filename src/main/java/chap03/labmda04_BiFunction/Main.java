package chap03.labmda04_BiFunction;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***ラムダ式***");
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        int result = calc.apply(1,2);
        System.out.println(result);
    }
}
