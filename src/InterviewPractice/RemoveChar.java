package InterviewPractice;

public class RemoveChar {
    public static void main(String[] arg) {
        String name = "ajith";
        System.out.println(name);
        StringBuilder stringBuilder = new StringBuilder();
        var output = replace(name, 'a', 0, stringBuilder);
        System.out.println(output);
    }

    static String replace(String str, char ch, int index, StringBuilder stringBuilder) {


        if (index < str.length()) {
            if (str.charAt(index) == ch) {
                stringBuilder.append("A");
            } else {
                stringBuilder.append(str.charAt(index));
            }
            return replace(str, ch, index + 1, stringBuilder);
        } else {
            return stringBuilder.toString();
        }


    }
}
