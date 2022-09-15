package InnerClass;


class Outer1 {
    void yes() {
        class LocalInnerClass {
            int a = 23;
            int b = 45;

            void add() {
                int c = a + b;
                System.out.println(c);
            }

        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.add();
    }
}

public class LocalinnerClass {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.yes();
    }
}
