package LeetCode;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberString {
    public void main(String[] args) {
//        int a = Ajith.a;
        Ajith ajith = new Ajith();
        int bb = ajith.b;
//        int aa = Ajith.a;

        String digits = "";
        System.out.println(digits.length());
        List<String> output = new ArrayList<>();
//        if(digits.length()==0){
//            return output;
//        }


        Map<Integer, List<String>> valueLists = new HashMap<>();
        valueLists.put(2, new ArrayList<>());
        valueLists.put(3, new ArrayList<>());
        valueLists.put(4, new ArrayList<>());
        valueLists.put(5, new ArrayList<>());
        valueLists.put(6, new ArrayList<>());
        valueLists.put(7, new ArrayList<>());
        valueLists.put(8, new ArrayList<>());
        valueLists.put(9, new ArrayList<>());

        valueLists.get(2).add("a");
        valueLists.get(2).add("b");
        valueLists.get(2).add("c");
        valueLists.get(3).add("d");
        valueLists.get(3).add("e");
        valueLists.get(3).add("f");
        valueLists.get(4).add("g");
        valueLists.get(4).add("h");
        valueLists.get(4).add("i");
        valueLists.get(5).add("j");
        valueLists.get(5).add("k");
        valueLists.get(5).add("l");
        valueLists.get(6).add("m");
        valueLists.get(6).add("n");
        valueLists.get(6).add("o");
        valueLists.get(7).add("p");
        valueLists.get(7).add("q");
        valueLists.get(7).add("r");
        valueLists.get(7).add("s");
        valueLists.get(8).add("t");
        valueLists.get(8).add("u");
        valueLists.get(8).add("v");
        valueLists.get(9).add("w");
        valueLists.get(9).add("x");
        valueLists.get(9).add("y");
        valueLists.get(9).add("z");


        if (digits.length() == 1) {
            for (int m = 0; m < 2; m++) {
                char c = digits.charAt(m);
                List<String> value1 = valueLists.get(Character.getNumericValue(c));
                for (int i = 0; i < value1.size(); i++) {
                    output.add(value1.get(i));
                }
                break;
            }
            System.out.println(output);
//            return output;

        } else {
            for (int k = 0; k < digits.length() - 1; k++) {
                char c = digits.charAt(k);
                char c1 = digits.charAt(k + 1);


                List<String> value1 = valueLists.get(Character.getNumericValue(c));
                List<String> value2 = valueLists.get(Character.getNumericValue(c1));
                for (int i = 0; i < value1.size(); i++) {
                    for (int j = 0; j < value2.size(); j++) {
                        output.add(value1.get(i) + value2.get(j));
                    }
                }
                break;
            }

            System.out.println(output);
//            return output;
        }


    }

    class Ajith {
         int a = 7;
        int b = 9;
    }
}
