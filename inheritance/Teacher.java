package inheritance;

public class Teacher extends Person {
    String education;

    void show2(String qualify){
        education = qualify;
        System.out.print(education);
    }
}
