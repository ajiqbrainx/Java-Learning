package JavaInterview;

public class SpaceRemoverCharacter {

    public static void main(String[] args) {
        String name = "My name is Ajith";
        StringBuilder yes = new StringBuilder();
        for (int i = 0; i <= name.length() - 1; i++) {
            if (!Character.isWhitespace(name.charAt(i))) {
                yes.append(name.charAt(i));
            }
        }
        System.out.println(yes);

        int a = 10, b = 20;
        System.out.println(a + '+' + "ajith" + b);

    }
}
