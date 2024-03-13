package Mine.Interview;

import java.lang.reflect.Constructor;

public class Encapuslation {
    int a;
    int b;
    int sum;

     Encapuslation(int aa,int bb){
         this.a=aa;
         this.b=bb;
     }

    void sumOfTheValue(){
        sum=a+b;
        System.out.println("Sum of the value is = "+sum);
    }

}

   class Main1{
       public static void main(String[] args) {

           // Here We achieving the Data hiding
           Encapuslation encapuslation=new Encapuslation(1,2);
           encapuslation.sumOfTheValue();

       }
   }
