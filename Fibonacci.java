public class Fibonacci {
    public static void main(String[] args){
        int a, b, sum;
        a = 0;
        b= 1;
        for(int i = 0; i<= 3; i++){
            sum = a + b;
            System.out.print(sum);
            a= b;
            b= sum;
        }
    }
}
