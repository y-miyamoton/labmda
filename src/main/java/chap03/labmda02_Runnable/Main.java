package chap03.labmda02_Runnable;

public class Main {

    public static void main(String[] args) {

        // ラムダ式使用
        System.out.println("\n***ラムダ式使用***");
        Runnable executor3 = () -> System.out.println("ラムダ式を使用しました。");
        executor3.run();
    }
}
