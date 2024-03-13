package Mine.Practice;

public class SwapTwo {
    public static void main(String[] args) {
        int first = 23;
        int second = 56;
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("first -> "+first);
        System.out.println("second -> "+second);
    }
}
