package Mine.Oops.Polymorphism;

public class CompileTime {

//    Method overloading => its compile-time polymorphism

    public void add(int a, int b) {
        System.out.println("add number is int : " + a + b);
    }

    public void add(double a, double b) {
        System.out.println("add number is double : " + a + b);
    }

    public static void main(String[] args) {

        CompileTime polymorphismExample = new CompileTime();

        polymorphismExample.add(1,23);   // at compile-time your are passing which method to execute the code
        polymorphismExample.add(1.2,2.0);  // at compile-time your are passing which method to execute the code

    }
}
