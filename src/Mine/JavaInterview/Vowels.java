package JavaInterview;

public class Vowels {
    public static void main(String[] args) {
        String name = "ajith";
        String vowel = "aeiou";

        for (int i = 0; i < name.length(); i++) {
            char[] character = name.toCharArray();
            if (vowel.charAt(i) == (character[i])) {
                System.out.println(character[i] + " Its is present");
            }
        }
    }
}
