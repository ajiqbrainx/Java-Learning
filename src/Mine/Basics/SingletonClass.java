package Mine.Basics;

class Aji {

    static volatile Aji aji = null;    //Initially we declare to null because once the object is created then only it created the object

    private Aji() {

    }

    public static Aji getInstance() {
        if (aji == null)
            aji = new Aji();
        return aji;
    }

    public void getName(){
        System.out.println("It is calling the name ");
    }


}

public class SingletonClass {
    public static void main(String[] args) {
        Aji aji = Aji.getInstance();
        aji.getName();

        Aji aji1 = Aji.getInstance();
        aji1.getName();
    }
}
