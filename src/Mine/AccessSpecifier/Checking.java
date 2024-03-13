package Mine.AccessSpecifier;

public class Checking extends ProtectedEx {
    void sub(){
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Checking checking  =new Checking();
        checking.sub();
    }
}
