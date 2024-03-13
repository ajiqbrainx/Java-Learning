package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {

        String name = "abcabcbb";

        List<String> list = new ArrayList<>();

        var outputList = substring(name, list, 0);

        int length = 0;

        for (int i = 0; i < outputList.size(); i++) {

            int ll=outputList.get(i).toString().length();

            if ( ll> length) {
               length=ll;
            }
        }
        System.out.println(length);

    }

    static List substring(String name, List<String> list, int index) {

        List<Character> characters = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = index; i < name.length(); i++) {
            if (!characters.contains(name.charAt(i))) {
                characters.add(name.charAt(i));
            } else {
                for (char value : characters) {
                    stringBuffer.append(value);
                }
                list.add(stringBuffer.toString());
                return substring(name, list, index+1);
            }
        }
        if (!characters.isEmpty()) {
            for (char value : characters) {
                stringBuffer.append(value);
            }
            list.add(stringBuffer.toString());
        }
        return list;

    }
}
