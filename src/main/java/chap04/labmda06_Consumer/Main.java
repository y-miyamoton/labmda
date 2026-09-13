package chap04.labmda06_Consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        String fix = " 様";

        printName("佐藤花子", s -> System.out.println(s + fix));
    }

    static void printName(String name, Consumer<String> c) {

        c.accept(name);
    }
}
