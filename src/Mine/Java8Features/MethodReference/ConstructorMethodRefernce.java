package Java8Features.MethodReference;

interface View1 {
    void check();
}

class Main1 {
    public Main1(String msg) {
        System.out.println("Checking main..." + msg);
    }
}

public class ConstructorMethodRefernce {
    public static void main(String[] args) {
//        View1 view1 = Main1::new;   //We need to work on this....
//        view1.check();

    }
}
