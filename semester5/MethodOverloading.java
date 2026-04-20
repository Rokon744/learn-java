public class MethodOverloading{

    void car(){
        System.out.println("This is the Simple Car");
    }
    void car(String gearbox){
        System.out.println("This is the car with" + gearbox);
    }
    public static void main(String[] args){
        MethodOverloading car1 = new MethodOverloading();
        car1.car();
        car1.car(" Gear");
    }
}