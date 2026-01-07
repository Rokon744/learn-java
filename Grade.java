public class Grade {
    public static void main(String[] args) {
        int myNum = 50;
        String grade = null;
        switch (myNum / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "A-";
                break;
            case 5:
                grade = "B";
                break;
            case 4:
                grade = "C";
                break;
            default:
                grade = "Fail";
                break;
        }
        System.out.print(grade);
    }
}
