package ETI.Keywords;

public class StaticMethod {
    static String name = "Ajith";

    static void name() {
//        static String name = "Ajith";
        System.out.println("Its is method level static " + name);
    }

    public static void main(String[] args) {

        name();
        System.out.println(""+name);
    }
}
