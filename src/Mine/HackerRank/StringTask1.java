package Mine.HackerRank;

public class StringTask1 {
    public static void main(String[] args) {
        String name = "ab cd ef";

        String output = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                output = output + ',';
            } else {
                output = output + name.charAt(i);
            }

        }

        System.out.println(output);
    }
}
