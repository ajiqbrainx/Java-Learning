package Basics;

public interface InterfaceClass {
    int sum();
    int sub(int a,int b);
}

abstract class AbsClass implements InterfaceClass {
    abstract void sum1();

    int add(int a, int b) {
        return a + b;
    }
}

   class Perfect extends AbsClass{


       @Override
       public int sum() {
           return 0;
       }

       @Override
       public int sub(int a, int b) {
           return 0;
       }

       @Override
       void sum1() {

       }
   }


class Mainn {
    public static void main(String[] args) {
        Perfect perfect=new Perfect();
        System.out.println(perfect.sub(1,2));
        System.out.println(perfect.add(1,2));

    }
}
