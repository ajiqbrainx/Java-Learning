package Array;

public class ObjectArray {

    int age;
    String name1;

    ObjectArray(String name, int age1) {
        this.age = age1;
        this.name1 = name;
    }

    public void display() {
        System.out.println("Name : " + name1);
        System.out.println("Age : " + age);
    }

}

class Main {
    public static void main(String[] args) {
        ObjectArray objectArray[] = new ObjectArray[3];
        objectArray[0] = new ObjectArray("Ajith", 23);
        objectArray[1] = new ObjectArray("Ashok", 21);

        for (int i = 0; i < objectArray.length; i++) {
            objectArray[i].display();
            System.out.println(" ");
        }
    }
}
