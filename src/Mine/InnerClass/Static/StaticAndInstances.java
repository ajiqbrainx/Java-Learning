package Mine.InnerClass.Static;

class Aji {
    int a = 10;
    static int b = 10;

    void check() {
        int c = a + b;
        System.out.println(c);
    }

}

public class StaticAndInstances {
    public static void main(String[] args) {
        Aji aji1 = new Aji();
        aji1.check();
        Aji aji2 = new Aji();
        aji2.a = 20;
        aji2.b = 20;
        aji2.check();
        aji1.check();
    }
}
