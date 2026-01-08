public class TestObject{
    String carName;
    int carSpeed;

    void runCar(){
        System.out.print(carName + " Running Speed is " + carSpeed);
    }

    public static void main(){
        TestObject car1 = new TestObject();
        car1.carName = "Volvo";
        car1.carSpeed = 200;

        TestObject car2 = new TestObject();
        car2.carName = "Audi";
        car2.carSpeed = 300;

        car2.runCar();
    }
}