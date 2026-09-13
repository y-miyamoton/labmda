package chap04.labmda10_central_interest;

public class Main {

    static void main(String[] args) {

        int add = CalcExec.add(7, 2);
        int sub = CalcExec.sub(7, 2);
        int mul = CalcExec.mul(7, 2);
        int div = CalcExec.div(7, 2);
        int mod = CalcExec.mod(7, 2);

        System.out.println(add + ", " + sub + "," + mul + "," + div + "," + mod);
    }
}
