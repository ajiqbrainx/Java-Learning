package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Break statement");
        for(int i=1;i<=a;i++){
            if(i==6)break;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Continue Statement");
        for(int i=1;i<=a;i++){
            if(i==7)continue;
            System.out.print(i+" ");
        }
    }
}
