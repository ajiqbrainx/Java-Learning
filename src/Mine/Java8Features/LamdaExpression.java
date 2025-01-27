package Mine.Java8Features;

@java.lang.FunctionalInterface
interface Lam {
    int main(int a, int b);

    default void sum() {
        System.out.println("Sum ....");
    }
}

public class LamdaExpression {
    public static void main(String[] args) {
        Lam lam = (int a, int b) -> {
            int c = a + b;
            return c;
        };
        System.out.println(lam.main(2, 3));
//        lam.sum();

    }
}
