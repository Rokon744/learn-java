import java.util.Scanner;

public class SumInMethod {

    public int calculator (int a, int b){
        return a+b;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        SumInMethod cal1 = new SumInMethod();
        int result = cal1.calculator(a, b);
        System.out.println("Ans is= "+ result);
    }
}