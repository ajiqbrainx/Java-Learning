package Mine.Java8Features.MethodReference;

interface View {
    void add(int a, int b);
}

public class InstanceMethod {
    public void adding(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();
        //First we have to create Instance for class then we use the reference for that
//        instance using the method reference
        View view = instanceMethod::adding;
        view.add(12, 34);




    }
}
