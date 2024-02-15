package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateChar {
    public static void main(String[] args) {

        String name = "abab";
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            boolean isPresent = false;
            for (int j = i + 1; j < name.length(); j++) {
                if (!list.contains(name.charAt(i))) {
                    String A = String.valueOf(name.charAt(i));
                    String B = String.valueOf(name.charAt(j));
                    if (A.equals(B)) {
                        isPresent = true;
                        break;
                    }
                }
            }
            list.add(name.charAt(i));
            if(isPresent){
                System.out.println("Its duplicate "+" "+name.charAt(i));
            }

            isPresent=false;
        }
    }
}
