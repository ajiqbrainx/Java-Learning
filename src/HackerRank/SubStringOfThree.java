package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubStringOfThree {
    public static void main(String[] args) {
        String name = "welcometojava";
        int length = 3;

        int finalLength = name.length() - length;

        StringBuilder stringBuilder = new StringBuilder();
        char initial = 'a';
        int a=initial;
        char end = 'z';
        int z=end;
        char A = 'A';
        int aa=A;
        char Z = 'Z';
        int zz=Z;

//        System.out.println(a);
//        System.out.println(z);
        System.out.println(aa);
        System.out.println(zz);



//        List<String> list = new ArrayList<>();
//        for (int i = initial; i <= end; i++) {
//            for (int j = 0; j < name.length(); j++) {
//                if (initial == name.charAt(j)) {
//                    if (j <= finalLength) {
//                        int index = j;
//                        int check = index + length;
//                        for (index = j; index < check; index++) {
//                            stringBuilder.append(name.charAt(index));
//                        }
//                        if (stringBuilder.toString().length() == length) {
//                            list.add(stringBuilder.toString());
//                            stringBuilder.setLength(0);
//                        } else {
//                            stringBuilder.setLength(0);
//                        }
//                    }
//                }
//            }
//            initial++;
//        }
//
//
//        if (list.size() > 2) {
//            System.out.println(list.get(0));
//            System.out.println(list.get(list.size() - 1));
//        }

    }
}
