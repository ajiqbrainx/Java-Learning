package Mine.Basics;

public class NestingMethods {

    private int a, b;

    NestingMethods(int aa, int bb) {
        a = aa;
        b = bb;
    }

    int lesserThan() {
        if (a > b)
            return b;
        else return a;
    }

    void show() {
        int lesser = lesserThan();
        System.out.println(" It is the lesser value = " + lesser);
    }

}

class Main {
    public static void main(String[] args) {
        NestingMethods nestingMethods = new NestingMethods(23, 56);
        nestingMethods.show();
    }
}
