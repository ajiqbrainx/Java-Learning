package Practice;

import java.util.Scanner;

public class Terinary {
    public static void main(String[] args) {
        System.out.println("Enter your Sex : male or female ");
        Scanner n = new Scanner(System.in);
        String name = n.next();
        String Sex = (name.equals("male")) ? "Its is male" : "Its female";
        System.out.println(Sex);

    }
}
