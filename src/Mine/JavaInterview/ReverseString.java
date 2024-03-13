package JavaInterview;

public class ReverseString {

    public static void main(String[] args) {
        stringReverse("HTIJA");
    }

    public static StringBuilder stringReverse(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] character = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            stringBuilder.append(character[i]);
        }
        System.out.println(stringBuilder);
        return stringBuilder;
    }
}
