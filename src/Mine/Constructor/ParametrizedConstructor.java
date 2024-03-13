package Mine.Constructor;

public class ParametrizedConstructor {

     double x,y;

    ParametrizedConstructor (){    //Default Constructor
        System.out.println("Default Con...");
        x=2;
        y=4;
    }
    ParametrizedConstructor(double xx,double yy){      //Parametrized Constructor
        System.out.println("Parametrized Con...");
        x=xx;
        y=yy;
    }
    ParametrizedConstructor(double xx){      //Constructor Overloading
        System.out.println("Con Overloading...");
         double z=xx+y;
        System.out.println(z);

    }

    void check(){
         double z=x*y;
        System.out.println(z);
    }
}
class Main1{
    public static void main(String[] args) {
        ParametrizedConstructor parametrizedConstructor=new ParametrizedConstructor();
        parametrizedConstructor.check();
        ParametrizedConstructor parametrizedConstructor1=new ParametrizedConstructor(23,44);
        parametrizedConstructor1.check();
        ParametrizedConstructor parametrizedConstructor2=new ParametrizedConstructor(22);
        parametrizedConstructor2.check();



    }
}


