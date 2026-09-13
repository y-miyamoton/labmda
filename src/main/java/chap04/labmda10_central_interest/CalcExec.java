package chap04.labmda10_central_interest;

import java.util.function.BinaryOperator;

public class CalcExec {

    public static int add(int a, int b) {
        return exec(a, b, (x, y) -> x + y);
    }

    public static int sub(int a, int b) {
        return exec(a, b, (x, y) -> x - y);
    }

    public static int mul(int a, int b) {
        return exec(a, b, (x, y) -> x * y);
    }

    public static int div(int a, int b) {
        return exec(a, b, (x, y) -> x / y);
    }

    public static int mod(int a, int b) {
        return exec(a, b, (x, y) -> x % y);
    }

    private static int exec(int a, int b, BinaryOperator<Integer> calc) {

        System.out.println("[引数]:" + a + ", " + b);

        int result = calc.apply(a, b);

        System.out.println("[結果]:" + result);

        return result;
    }
}
