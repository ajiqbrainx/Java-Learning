package Interview;

abstract class AbsClass implements InterfaceClass {

    abstract void abc();

//    public void print() {
//        System.out.println("It is Abstract class ");
//    }
}

interface InterfaceClass {

}

class B extends AbsClass {

    @Override
    void abc() {

    }
}

class Main3 {
    public static void main(String[] args) {
//        AbsClass absClass=new AbsClass() ;
//        InterfaceClass interfaceClass=new InterfaceClass();


        B b = new B();
//        b.print();
    }
}
