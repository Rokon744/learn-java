public class CircleArea{
    String name;
    int age;
    int mark;

    // Contructor
    CircleArea(){
        age = 10;
        name= "Raaaaa";
        mark= 33;
    }

    CircleArea(String n, int a, int m){
        name = n;
        age = a;
        mark = m;

        System.out.print("\nName=" + name + " Age=" + age + " Mark="+ mark);
    }

    void show(){
        System.out.print("\nName=" + name + " Age=" + age + " Mark="+ mark);
    }

    public static void main(){
        CircleArea stu1 = new CircleArea("Rokon", 21, 90);
        CircleArea stu2 = new CircleArea("Richy", 20, 90);
        CircleArea stu3 = new CircleArea("Kusum", 22, 80);
        CircleArea stu4 = new CircleArea();
        stu4.show();
    }
}