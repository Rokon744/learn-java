public class SqSerialSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum = sum + (i * i);
            i++;
        } while (i <= 0);
        System.out.print(sum);

        int summ = 0;
        for(int j = 1; j<= 3; j++){
           summ = summ+ (j*j);
        }
        System.out.print(summ);
    }
}
