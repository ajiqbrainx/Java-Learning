package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class StringNumber {
    public static void main(String[] args) {

        String name = "mac1ha a3re h0i h2ow y4ou d5a";

        String input = "81,17";

        String[] ar = input.split(",");

        int years = Integer.parseInt(ar[0]);
        int months = Integer.parseInt(ar[1]);

        // Print the values
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);


//        StringBuilder stringBuilder = new StringBuilder();
//        List<String> list = new ArrayList<>();
//        List<String> output = new ArrayList<>();
//
//        for (int i = 0; i < name.length(); i++) {
//
//            if (name.charAt(i) != ' ') {
//                stringBuilder.append(name.charAt(i));
//            } else {
//                if (!stringBuilder.toString().equals(" ")) {
//                    list.add(stringBuilder.toString());
//                }
//                stringBuilder.setLength(0);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j).contains(String.valueOf(i))) {
//                    String value = list.get(j).replace(String.valueOf(i), "");
//                    output.add(value);
//                }
//            }
//        }
//
//        System.out.println(list);
//        System.out.println(output);
//
//        String finalOutput = "";
//
//        for (String ch : output) {
//            finalOutput = finalOutput + " " + ch;
//        }
//        System.out.println(finalOutput);

    }
}
