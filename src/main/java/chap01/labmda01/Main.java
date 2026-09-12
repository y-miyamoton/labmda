package chap01.labmda01;

public class Main {

    static void main(String[] args) {

        // クラス使用
        System.out.println("\n***クラス使用***");
        Changer changer = new ChangerImpl();
        int result1 = changer.change(5);
        System.out.println(result1);

        // クラス使用
        System.out.println("\n***匿名クラス使用***");
        Changer chager2 = new Changer() {
            @Override
            public int change(int n) {
                return n * 2;
            }
        };
        int result2 = chager2.change(6);
        System.out.println(result2);

        // ラムダ式使用
        System.out.println("\n***ラムダ式使用***");
        Changer changer3 = (int n) -> {
            return n * 2;
        };
        int result3 = changer3.change(7);
        System.out.println(result3);
    }
}
