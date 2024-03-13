package JavaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HighestNumInt {
    public static void main(String[] args) {
        String value = "a12a234sdfsdd3456sfsegd6788";
        System.out.println("[ "+value+" ]");
        String number = "[0-9]";
        Pattern pattern = Pattern.compile(number);
        StringBuilder stringBuilder = new StringBuilder();

        List<Long> longList = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
            String checkNumber = String.valueOf(value.charAt(i));
            Matcher ifPresent = pattern.matcher(checkNumber);
            if (ifPresent.find()) {
                stringBuilder.append(checkNumber);
            } else {
                if (!stringBuilder.toString().equals("")) {

                    longList.add(Long.parseLong(stringBuilder.toString()));

                    stringBuilder.setLength(0);
                }
                stringBuilder.setLength(0);
            }
        }

        if (!stringBuilder.toString().equals("")) {
            longList.add(Long.parseLong(stringBuilder.toString()));
        }

        System.out.println(longList);
        long output = 0;

        for (int i = 0; i < longList.size(); i++) {
            if (longList.get(i) > output) {
                output = longList.get(i);
            }
        }

        System.out.println("[ "+output+" ]");
    }


}
