package Interview;

public class Swap {
    public static void main(String[] args) {
        int a=99;
        int b=29;

        a=a+b; //128
        b=a-b; //99
        a=a-b; //29
        System.out.println(a);
        System.out.println(b);
    }
}
