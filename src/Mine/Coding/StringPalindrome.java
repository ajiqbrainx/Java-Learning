package Mine.Coding;

public class StringPalindrome {
    public static void main(String[] args) {

        String name = "ab:a";

        String lowercaseRegex = "[a-z]+";
        String uppercaseRegex = "[A-Z]+";

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < name.length(); i++) {
            String value = String.valueOf(name.charAt(i));

            if (value.matches(lowercaseRegex)) {
                stringBuilder.append(value.toLowerCase());
            }
            if (value.matches(uppercaseRegex)) {
                stringBuilder.append(value.toLowerCase());
            }
        }
        String original = stringBuilder.toString();
        String output = stringBuilder.reverse().toString();


        System.out.println(original);

        System.out.println(output);

        if (original.equals(output)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
