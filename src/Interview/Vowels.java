package Interview;

public class Vowels {
    public static void main(String[] args) {

        String input = "ajith";

        for (int i = 0; i < input.length(); i++) {

            char letter = input.charAt(i);
            boolean present = String.valueOf(letter).matches(".*[aeiou].*");
            if (present) {
                System.out.println(letter + " " + "It is present ");
                present = false;
            } else {
                System.out.println(letter + " " + "It is not present ");
            }
        }
    }
}
