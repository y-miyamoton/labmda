package chap03.labmda03_Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Integer> getter = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        int result1 = getter.get();
        System.out.println(result1);
    }
}
