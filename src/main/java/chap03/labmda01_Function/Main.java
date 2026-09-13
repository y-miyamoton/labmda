package chap03.labmda01_Function;

import java.util.function.Function;

public class Main {

    static void main(String[] args) {

        // ラムダ式使用
        System.out.println("\n***ラムダ式使用***");
        Function<Integer, Integer> changer3 = n -> n * 2;
        int result3 = changer3.apply(7);
        System.out.println(result3);
    }
}
