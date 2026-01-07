public class CheckPrime {
    public static void main(String[] args) {
        // try {

        // } catch (ArithmeticException e) {
        // System.out.println("Math error");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array limit crossed");
        // } finally {
        // System.out.println("Program finished");
        // }
        
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("dividation not possible");
        } finally {
            System.out.println("Thanks Program End");
        }
    }
}
