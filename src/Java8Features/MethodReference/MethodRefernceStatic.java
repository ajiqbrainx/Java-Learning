package Java8Features.MethodReference;


interface Fun {
    void new1();
}

public class MethodRefernceStatic {

    static void show() {
        System.out.println("Showing Something.........");
    }

    public static void main(String[] args) {
        Fun methodRefernce = MethodRefernceStatic::show;
        methodRefernce.new1();

    }

}
