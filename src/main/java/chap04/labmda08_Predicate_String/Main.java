package chap04.labmda08_Predicate_String;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Yamada", "Sato", "Suzuki", "Okada", "Yano");
        display(list, s -> s.length() >= 5);
        display(list, s-> s.startsWith("S"));
    }

    private static void display(List<String> list, Predicate<String> p) {

        for (String s : list) {
            if (p.test(s)) {
                System.out.println(s);
            }

        }

    }
}
