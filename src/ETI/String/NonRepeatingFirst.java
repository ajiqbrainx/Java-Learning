package ETI.String;

import java.util.HashSet;
import java.util.Optional;

public class NonRepeatingFirst {


    static void nonRepeatingChar(String name) {
        HashSet<Character> unique = new HashSet<>();
        for (int i = 0; i < name.length(); i++) {

            boolean isPresent = false;
            for (int j = i + 1; j < name.length(); j++) {
                if (!unique.contains(name.charAt(i))) {
                    if (name.charAt(i) == name.charAt(j)) {
                        isPresent = true;
                        break;
                    }
                }else{
                    isPresent =true;
                    break;
                }

            }
            unique.add(name.charAt(i));
            if (!isPresent) {
                System.out.println(name.charAt(i));
                break;
            }

        }


    }

    public static void main(String[] args) {

        String name = "rttsfdr";
        nonRepeatingChar(name);

    }
}
