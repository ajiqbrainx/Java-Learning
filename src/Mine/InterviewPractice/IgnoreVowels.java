package InterviewPractice;

public class IgnoreVowels {
    public static void main(String[] args) {

        String name = "Compuuter";
        String output = "";

//        a, e, i, o, and u

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'a' || name.charAt(i) == 'E' || name.charAt(i) == 'e' || name.charAt(i) == 'I' || name.charAt(i) == 'i' || name.charAt(i) == 'O' || name.charAt(i) == 'o' || name.charAt(i) == 'U' || name.charAt(i) == 'u') {
            } else output = output + name.charAt(i);

        }

        System.out.println(output);
    }
}
