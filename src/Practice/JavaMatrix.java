package Practice;

public class JavaMatrix {

    static int age = 3;

    public JavaMatrix() {
        age++;
    }
    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {

        JavaMatrix javaMatrix = new JavaMatrix();
        JavaMatrix javaMatrix1 = new JavaMatrix();
        javaMatrix.display();
        javaMatrix1.display();


    }



}
