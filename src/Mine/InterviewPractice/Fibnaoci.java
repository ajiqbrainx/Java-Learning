package Mine.InterviewPractice;

public class Fibnaoci {
    public static void main(String[] args) {

//        0,1,1,2,3,5,8

        int input = 6;

        int a;
        int b = 0;
        int c = 1;

        for (int i = 0; i <= input; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a +" ");
        }


    }
}
