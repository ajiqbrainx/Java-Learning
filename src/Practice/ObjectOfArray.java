package Practice;

public class ObjectOfArray {

    int age;
    String name;

    ObjectOfArray(int age1, String name1) {
        age = age1;
        name = name1;
    }

    void print() {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }
}

class Main {
    public static void main(String[] args) {
        ObjectOfArray[] objectOfArrays = new ObjectOfArray[3];
        objectOfArrays[0] = new ObjectOfArray(23, "Ajith");
        objectOfArrays[1] = new ObjectOfArray(24, "Akil");
        objectOfArrays[2] = new ObjectOfArray(25, "Abi");
//        objectOfArrays[3]=new ObjectOfArray(26,"Achu");

        for (int i = 0; i < objectOfArrays.length; i++) {
            objectOfArrays[i].print();
        }

    }

}
