package Interview;

public class StaticMethods {

    static int a=0;

    int b=0;
    public static void check(){
        System.out.println("Its static method...");
    }
    public void nonCheck(){
        System.out.println("Its Non static method....");
    }



    public static void main(String[] args) {
        check();
        int a1=a;
        System.out.println(a);
        StaticMethods nonStaticMethods=new StaticMethods();
        nonStaticMethods.nonCheck();
        int b1=nonStaticMethods.b;
        System.out.println(b1);
    }
}
