package Mine.Java8Features.Lamda;

public class FunctionalInterface {
    public static void main(String[] args) {
        Name yourName = na -> "your name is " + na;
        var output = yourName.name("Ajith");
        System.out.println(output);

    }
}

interface Name {
    String name(String name);
}