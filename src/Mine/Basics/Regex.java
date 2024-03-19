package Mine.Basics;

public class Regex {
    public static void main(String[] args) {

        String name = "Hi this is Sanjeev";

        String lowercaseRegex = "[a-z]+";
        String uppercaseRegex = "[A-Z]+";

        int caps = 0;
        int small = 0;
        int space = 0;



        for (int i = 0; i < name.length(); i++) {
            String input = String.valueOf(name.charAt(i));

            if (input.matches(lowercaseRegex)) {
                small++;
            } else if (input.matches(uppercaseRegex)) {
                caps++;
            } else if (input.matches(" ")) {
                space++;
            }

        }

        System.out.println("caps is = "+caps);
        System.out.println("caps is = "+small);
        System.out.println("caps is = "+space);
    }
}
