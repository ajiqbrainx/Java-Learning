package Mine.Oops.Abstraction;



interface Cars{
    void start();
}

class Starts implements Cars{

    @Override
    public void start(){
        System.out.println("Car is starting using the key");
    }
}
public class InterfaceAbstraction {
    public static void main(String[] args) {


        Cars cars=new Starts();
        cars.start();  // Here we don't know the implementation how the car is starting

    }

}
