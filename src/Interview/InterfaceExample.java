package Interview;

interface interExample {
    final static int A = 23;    // If you declare a variable in interface It will be [final and static]
    int B = 45;

    public abstract void sum();

    public static void multiply() {   // If you create non-abstract method you should be use in only [static and default]
        System.out.println("It is a non abstract method");
        int C = A + B;
        System.out.println(C);
    }
   default void noNeedToInherit(){
       System.out.println("It is a Default method.....");
   }
}

interface interEx extends interExample {    // interface and interface we can extend it only....not implements
    void sum1();


}
class Join implements interEx,interExample{


    @Override
    public void sum() {

    }

    @Override
    public void sum1() {

    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        System.out.println(interExample.A);
        interExample.multiply();

    }
}
