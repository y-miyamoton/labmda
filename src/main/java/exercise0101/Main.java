package exercise0101;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***固定メッセージ***");
        StringGetter sg1 = () -> "こんにちは。";
        String result1 = sg1.getString();
        System.out.println(result1);

        System.out.println("\nランダム(0~9)");
        StringGetter sg2 = () -> "乱数:" + new Random().nextInt(10);
        String result2 = sg2.getString();
        System.out.println(result2);
    }
}
