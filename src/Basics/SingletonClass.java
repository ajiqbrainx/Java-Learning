package Basics;

class Aji {

    static Aji aji = null;    //Initially we declare to null because once the object is created then only it created the object

    private Aji() {
    }

    public static Aji get() {
        if (aji == null)
            aji = new Aji();
        return aji;
    }





}

public class SingletonClass {
    public static void main(String[] args) {
        Aji aji =Aji.get();





    }
}
