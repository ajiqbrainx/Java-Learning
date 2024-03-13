package Mine.InnerClass;

class NonStatic {
    static int a = 12;
    static int b = 23;

    static class Access {


        static int add = a + b;    //Use only the static variables in the static class and non-static members not Accessing

        static void print() {
            System.out.println(add);
        }
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        NonStatic.Access access = new NonStatic.Access();
        access.print();
    }
}
