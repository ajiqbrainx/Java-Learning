package ETI.Practise;

import javax.print.DocFlavor;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {

        String name = "asdabaaabber";


        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new LinkedList<>();

        for (int i = 0; i < name.length(); i++) {


            for (int j = i; j < name.length(); j++) {

                stringBuilder.append(name.charAt(j));
                StringBuilder normal = new StringBuilder();
                normal.append(stringBuilder);
                if (normal.toString().contentEquals(normal.reverse())) {
                    list.add(normal.toString());
                }
            }
            stringBuilder.setLength(0);
        }

        System.out.println(list);
        StringBuilder output=new StringBuilder();
        for (String palindrome : list) {
            if(palindrome.length() > output.length()){
                output.setLength(0);
                output.append(palindrome);
            }
        }

        System.out.println(output);
    }
}
