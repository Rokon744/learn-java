public class ArraySort {
    public static void main(String[] args) {
        int arra[] = { 3, 1, 8, 6, 9, 0, 2, 7, 5, 4 };
        int temp;

        for (int i = 0; i < arra.length; i++) {
            for (int j = i + 1; j < arra.length; j++) {
                if (arra[i] < arra[j]) {
                    temp = arra[i];
                    arra[i] = arra[j];
                    arra[j] = temp;
                }
            }
        }

        for(int i= 0; i< arra.length; i++){
            System.out.println(arra[i]);
        }
    }
}
