package Basics;

public class StringReverse {
    public static void main(String[] args) {
        String name = "ram";
        String output = "";

//        StringBuilder stringBuilder = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
//            stringBuilder.append(name.charAt(i));
            output = output + name.charAt(i);
        }
        System.out.println(output);

//        System.out.println(stringBuilder);
        if (output.toString().equals(name)) {
            System.out.println("Its true");
        } else {
            System.out.println("Its not a true");
        }


    }
}
