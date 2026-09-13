package chap02.labmda02;

public class Main {

    public static void main(String[] args) {

        // クラス使用
        System.out.println("\n***クラス使用***");
        Executor executor = new ExecutorImpl();
        executor.exec();

        // 匿名クラス使用
        System.out.println("\n***匿名クラス使用***");
        Executor executor2 = new Executor() {
            @Override
            public void exec() {
                System.out.println("匿名クラスを使用しました。");
            }
        };
        executor2.exec();

        // ラムダ式使用
        System.out.println("\n***ラムダ式使用***");
        Executor executor3 = () -> System.out.println("ラムダ式を使用しました。");
        executor3.exec();
    }
}
