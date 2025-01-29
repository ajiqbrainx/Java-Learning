package Mine.Oops.Abstraction;


abstract class Car{
    abstract void start();
}

class Start extends Car{

    @Override
    void start() {
        System.out.println("Car is starting using the Key ");
    }
}


public class AbstractionExample {
    public static void main(String[] args) {

        Car car = new Start();
        car.start();   // Here we don't know the implementation how the car is starting

    }
}
