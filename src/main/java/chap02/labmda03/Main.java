package chap02.labmda03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Getter getter = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        int result1 = getter.get();
        System.out.println(result1);
    }
}
