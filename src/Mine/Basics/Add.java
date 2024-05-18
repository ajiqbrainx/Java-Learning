package Mine.Basics;

public class Add {
    public static void main(String[] args) {

        System.out.println(add(1,6));



    }

    public static String add(int num1, int num2) {
        int total = num1 + num2;
        String output = "Your total is " + total;
        return output;
    }
}
