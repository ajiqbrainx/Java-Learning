package Mine.Interview;

import java.lang.reflect.Method;

public class PrivateClass {

    private int a = 3;
    private int b = 4;
    private int c = 9;



    private void sum() {
        System.out.println(a + b + c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class Main {
    public static void main(String[] args) throws Exception {


//        Class c = PrivateClass.class;
//        Object p = c.newInstance();
//        Method m =p.getClass().getDeclaredMethod("sum");
//        m.setAccessible(true);
//        m.invoke(p);




        PrivateClass privateClass=new PrivateClass();
//        privateClass.setA(1);
//        privateClass.setB(2);
//        privateClass.setC(3);
        privateClass.getA();
        privateClass.getB();
        privateClass.getC();


        System.out.println(privateClass.getA());


    }
}
