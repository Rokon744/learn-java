


public class Dighat {
    public static void main(String[] args) {
        double a, b, c;
        a = 1;
        b = 4;
        c = 4;

        double D = Math.sqrt(b * b - 4 * a * c);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("This is not imagine");
        }
    }
}
