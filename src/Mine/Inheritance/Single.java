package Mine.Inheritance;

public class Single {
    void bike(){
        System.out.println("BMW bike is Own....");
    }
}
class Single1 extends Single{
    void car(){
        System.out.println("AUDI car is own......");
    }
}
class Main {
    public static void main(String[] args) {
        Single1 single1=new Single1();
        single1.car();
        single1.bike();
    }
}
