package JavaInterview;

public class ReverseString {

    static StringBuilder stringReverse(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] n = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            stringBuilder.append(n[i]);
        }

        return stringBuilder;
    }


    public static void main(String[] args) {
        String name = "HTIJA";
        System.out.println(stringReverse(name));
    }
}
