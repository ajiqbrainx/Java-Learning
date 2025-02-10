package ETI.Practise;

import java.util.List;

public class VowelCheck {

    static boolean vowelCheck(String name) {
        boolean output = false;

        List<Character> vowels = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        for (int i = 0; i < name.length(); i++) {

            if (vowels.contains(name.charAt(i))) {
                return output = true;
            }

        }
        return output;

    }

    public static void main(String[] args) {

        System.out.println(vowelCheck("ssss"));

    }
}
