package Mine.InnerClass;

abstract class Aa {
    abstract void sum();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Aa aa =new Aa() {
            @Override
            void sum() {
                int a=34;
                int b=23;
                int c=a+b;
                System.out.println(c);
            }
        };
        aa.sum();
    }
}
