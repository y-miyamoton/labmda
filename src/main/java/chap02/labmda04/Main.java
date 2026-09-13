package chap02.labmda04;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***ラムダ式***");
        Calculator calc = (a, b) -> a + b;
        int result = calc.culculate(1,2);
        System.out.println(result);
    }
}
