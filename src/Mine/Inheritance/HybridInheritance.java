package Mine.Inheritance;

public class HybridInheritance {
    public static void main(String[] args) {

        FatherClass fatherClass =new FatherClass();
        System.out.println(fatherClass.father);
        System.out.println(fatherClass.grandpa);
        SonClass sonClass=new SonClass();
        System.out.println(sonClass.son);
    }

}
class GrandpaClass{
    String grandpa = "grandpa";
}

class FatherClass extends GrandpaClass{
    String father="dad";
}

class SonClass extends FatherClass{
    String son="son";
}
class DaughterClass extends FatherClass {
    String daughter="daughter";
}



