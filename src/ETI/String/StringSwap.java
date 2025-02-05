package ETI.String;

public class StringSwap {

    public static boolean areAlmostEqual(String s1, String s2) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s2);
        if (s1.equals(s2)) {
            return true;
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {

                char first = stringBuilder.charAt(i);
                char second = stringBuilder.charAt(j);
                stringBuilder.setCharAt(i, second);
                stringBuilder.setCharAt(j, first);
                if (stringBuilder.toString().equals(s1)) {
                    return true;
                }
                stringBuilder.setLength(0);
                stringBuilder.append(s2);
            }
        }

        return false;

    }

    public static void main(String[] args) {

        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(areAlmostEqual(s1, s2));
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(s2);
//        System.out.println(stringBuilder);
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            for (int j = i + 1; j < stringBuilder.length(); j++) {
//                char first = stringBuilder.charAt(i);
//                char second = stringBuilder.charAt(j);
//                stringBuilder.setCharAt(i, second);
//                stringBuilder.setCharAt(j, first);
//                System.out.println(stringBuilder);
//                if (stringBuilder.toString().equals(s1)) {
//                    System.out.println("It is true");
//                    break;
//                }
//                stringBuilder.setLength(0);
//                stringBuilder.append(s2);
//            }
//
//        }


    }


}
