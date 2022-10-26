package Practice;

public abstract class AstractClass {
    int a=23;
}
class Aji extends AstractClass {
    int b=34;
    int c=a+b;



}

 class MMain{
     public static void main(String[] args) {
         Aji aji=new Aji();

         System.out.println(aji.c);
     }
 }
