package InterviewPractice;

public class RemoveSpace {
    public static void main(String[] args) {
        String name = "Saket Saurav        is a QualityAna    list";
//        System.out.println(name);
        var ss = name.replace(" ", "");
        System.out.println(ss);
        String output = "";
        for (int i = 0; i < name.length(); i++) {
            String chars = String.valueOf(name.charAt(i));
            if (!chars.equals(" ")) {
                output = output + chars;
            }
        }
        System.out.println(output);

    }
}
