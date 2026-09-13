package chap04.labmda09_Predicate_Class;

import com.SalesEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<SalesEmployee> list = new ArrayList<>();
        list.add(new SalesEmployee(1001, "山田太郎1", 1, 150000));
        list.add(new SalesEmployee(1002, "山田太郎2", 2, 200000));
        list.add(new SalesEmployee(1003, "山田太郎3", 1,  90000));
        list.add(new SalesEmployee(1004, "山田太郎4", 2, 250000));
        list.add(new SalesEmployee(1005, "山田太郎5", 1,  70000));

        System.out.println("**売り上げが100000より大きい**");
        display(list, e ->e.salesAmount() > 100000);

        System.out.println("**女**");
        display(list, e -> e.gender() == 1);
    }

    static void display(List<SalesEmployee> list,
                        Predicate<SalesEmployee> p) {
        for (SalesEmployee e : list) {
            if (p.test(e)) {
                System.out.println(e.name());
            }
        }
    }
}
