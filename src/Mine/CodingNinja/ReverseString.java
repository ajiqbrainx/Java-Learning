package Mine.CodingNinja;

public class ReverseString {
    public static void main(String[] args) {

        String input = "10";
        var output = reverseString(input);
        System.out.println(output);

    }

    public static String reverseString(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }

        return output;
    }
}
