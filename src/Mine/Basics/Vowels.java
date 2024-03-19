package Mine.Basics;

public class Vowels {
    public static void main(String[] args) {

        String input = "orange";


        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                System.out.println(input.charAt(i));
            }
        }

    }
}
