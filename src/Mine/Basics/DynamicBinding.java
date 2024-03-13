package Mine.Basics;

class Class1 {
    void check() {
        System.out.println("Check is in class1");
    }
}

class Class2 extends Class1 {
    void check() {
        System.out.println("Check is in class2");
    }
}



public class DynamicBinding {
    public static void main(String[] args) {
        Class1 class1 = new Class2();       // If we're using the Instance of the base type is ...
        class1.check();

    }
}
