package Mine.InnerClass.Static;

public class StaticBlocks {
    static {
        System.out.println("It is the Static block 1...");
    }

    public static void main(String[] args) {
        System.out.println("It is the Main Program....");
    }
    static {
        System.out.println("It is the Static block 2....");
    }
}
