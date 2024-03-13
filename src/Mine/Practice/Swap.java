package Mine.Practice;

public class Swap {
    public static void main(String[] args) {

        int a = 20;
        int b = 40;
        System.out.println("Before");

        System.out.println(a +" a");
        System.out.println(b +" b");

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After");
        System.out.println(a +" a");
        System.out.println(b +" b");

    }
}
