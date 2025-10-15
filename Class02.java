public class Class02 {
    // public static void main(String[] args) {
    // int i, j;
    // for (i = 1; i <= 10; i++) {
    // for (j = 2; j * j <= i; j++) {
    // if (i % j == 0)
    // break;
    // }
    // if (j * j > i)
    // System.out.println(i);
    // }
    // }

    public static void main(String[] args) {
        int i, j;
        for (i = 2; i <= 10; i++) {
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
