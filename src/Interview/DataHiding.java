package Interview;

public class DataHiding {
    private int age;
    private String name;

   public int getA(int a){
       return a;
   }
   public void setA(int a){
       this.age=a;
   }

   public String getName(String name1){
       return name1;
   }
   public void setName(String name1){
       this.name=name1;
   }

   public void check(){
       System.out.println(String.format("Your Age is %d",age));
       System.out.println(String.format("Your name is %s",name));
   }

}
class Hiding{
       public static void main(String[] args){
        DataHiding dataHiding=new DataHiding();
        dataHiding.setA(23);
        dataHiding.setName("Ajith");
        dataHiding.check();
    }
}
