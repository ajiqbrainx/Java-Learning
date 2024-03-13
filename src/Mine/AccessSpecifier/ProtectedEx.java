package Mine.AccessSpecifier;

public class ProtectedEx {
    protected int a=90;
    protected int b=18;
}
class Pro extends ProtectedEx{
    void add(){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Pro pro =new Pro();
        pro.add();
    }
}