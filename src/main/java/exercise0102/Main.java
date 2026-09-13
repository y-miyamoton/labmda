package exercise0102;

public class Main {

    public static void main(String[] args) {

        StringChecker sc1 = s -> s.length() >= 5;
        boolean result11 = sc1.check("Yamamoto");
        boolean result12 = sc1.check("Sato");
        System.out.println("\n***result11***");
        System.out.println(result11);
        System.out.println("\n***result12***");
        System.out.println(result12);

        StringChecker sc2 = s -> s.contains("a");
        boolean result21 = sc2.check("Suzuki");
        boolean result22 = sc2.check("Sato");
        System.out.println("\n***result21***");
        System.out.println(result21);
        System.out.println("\n***result22***");
        System.out.println(result22);

        StringChecker sc3 = s -> s.equals(s.toUpperCase());
        boolean result31 = sc3.check("Aikawaw");
        boolean result32 = sc3.check("NISHINO");
        System.out.println("\n***result31***");
        System.out.println(result31);
        System.out.println("\n***result32***");
        System.out.println(result32);


    }
}
