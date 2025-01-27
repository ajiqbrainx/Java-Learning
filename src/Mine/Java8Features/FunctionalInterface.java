package Mine.Java8Features;

@java.lang.FunctionalInterface
interface InterfaceFun {
    void check();

    //    void check1();
    default void add() {
        System.out.println("Adding");
    }

    static void mul() {
        System.out.println("Multiplying.....");
    }
}

public class FunctionalInterface implements InterfaceFun {
    public static void main(String[] args) {
        InterfaceFun functionalInterface = new FunctionalInterface();   // Im using the data binding
//        Dynamic Binding.....


        functionalInterface.add();
        functionalInterface.check();
        InterfaceFun.mul();


    }

    @Override
    public void check() {
        System.out.println("Checking....");
    }
}
