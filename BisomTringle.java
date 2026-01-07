public class BisomTringle {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 5;
        c = 8;
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.print(area);
        } else{
            System.out.print("Tringle is not possible");
        }
    }
}
