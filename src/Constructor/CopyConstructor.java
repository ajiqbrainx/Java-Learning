package Constructor;

public class CopyConstructor {

    int x,y;
    CopyConstructor(int xx,int yy){
        x=xx;
        y=yy;
    }

    CopyConstructor(CopyConstructor c){
        System.out.println("Copy constructor is working fine....");
        x=c.x;
        y=c.y;
    }
    void check(){
       int z=x*y;
        System.out.println(z);
    }
}
class Main2{
    public static void main(String[] args) {
      CopyConstructor constructor=new CopyConstructor(22,33);
      constructor.check();
        CopyConstructor constructor1=new CopyConstructor(constructor);
        constructor1.check();

    }
}
