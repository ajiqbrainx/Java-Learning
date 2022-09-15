package InnerClass;

class Outer {
    int a = 23;

    class Inner {
        int b = 45;

        void sum() {
            int c = a + b;
            System.out.println(c);
        }
    }

    void mul() {
        Inner inner = new Inner();
        inner.sum();
        int d = a * inner.b;
        System.out.println(d);
    }

}

public class NestedInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.mul();

        Outer.Inner oi = new Outer().new Inner();
        oi.sum();

    }
}
