public class Test {
    public static void main(String[] args){
        try{
            int arr[] = new int[10];
            arr[20] = 100;
            System.out.println(arr[20]);
        } catch(Exception e){
            System.out.println("Limit crossed");
        } finally{
            System.out.println("Program End");
        }
    }
}
