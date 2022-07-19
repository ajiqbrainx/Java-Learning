package Interview;

public class SubClass {
     void privatCheck(){
        System.out.println("private");
    }
    public void publicCheck(){
        System.out.println("public");
    }
}

 class Child extends SubClass{
     public static void main(String[] args) {
         Child child=new Child();
         child.publicCheck();
         child.privatCheck();
     }
}
