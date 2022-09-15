package Inheritance;

interface tyre{
    void tyreType();
}
interface backPanel{
    void panel();
}
class car implements tyre,backPanel{

    @Override
    public void tyreType() {
        System.out.println("It is a Tyre....");
    }

    @Override
    public void panel() {
        System.out.println("It is a panel....");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        car car=new car();
        car.panel();
        car.tyreType();
    }
}
