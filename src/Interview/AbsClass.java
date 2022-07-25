package Interview;

abstract public class AbsClass {



    public void print(){
        System.out.println("It is Abstract class ");
    }
}
class B extends AbsClass{

}
class Main3{
    public static void main(String[] args) {
//        AbsClass absClass=new AbsClass() ;

        B b=new B();
        b.print();
    }
}
