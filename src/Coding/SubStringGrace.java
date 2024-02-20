package Coding;

public class SubStringGrace {
    public static void main(String[] args) {
        String[] array = {"sadness", "sad", "sadly"};
        int lessvalue = array[0].length();
        String subString = "";

        for (int i = 0; i < array.length; i++) {
            if (lessvalue > array[i].length()) {
                lessvalue = array[i].length();
                subString = array[i];
            }

        }

        boolean isPresent = true;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(subString)) {
                isPresent = false;
                break;
            }
        }

        System.out.println(isPresent + " " + subString);


    }
}
