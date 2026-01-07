public class Roots {
    public static void main(String[] args) {
        double a, b, c, d;
        a = 1;
        b = 4;
        c = 2;
        d = Math.sqrt(b * b - 4 * a * c);

        if (d > 0) {
            double root1 = (-b - d) / 2 * a;
            double root2 = (-b + d) / 2 * a;
            System.out.println("root1 is:" + root1 + "\n" + "Root2 is:" + root2);
        } else if (d == 0) {
            double root = -b / 2 * a;
            System.out.println(root);
        } else {
            System.out.println("Not Possible");
        }
    }
}