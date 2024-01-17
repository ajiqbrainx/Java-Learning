package Basics;

interface Ram {
   public  String read();
}
abstract class Sri {

    public abstract String read();

    public void write(){
        System.out.println("Ram");
    }

}

public class CheckingClass extends Sri{
    public static void main(String[] args) {

    }


    @Override
    public String read() {
        return null;
    }
}
