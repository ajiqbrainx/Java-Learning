package ETI.String;

import java.util.*;
import java.util.stream.IntStream;

public class CountVowels {
    public static void main(String[] args) {

        String name = "aeiou";
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

       long count= name.chars()
                .mapToObj(f-> (char)f )
                .filter(list::contains)
                .count();
        System.out.println(count);

//        int count = 0;
//        for (int i = 0; i < name.length(); i++) {
//            if (list.contains(name.charAt(i))) {
//                count++;
//            }
//        }
//
//        System.out.println(count);



    }
}
