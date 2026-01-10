package inher;

public class Main {
    public static void main(String[] args){
        Animal cat= new Dog();
        cat.eat();
        cat= new Animal();
        cat.eat();
    }
}
