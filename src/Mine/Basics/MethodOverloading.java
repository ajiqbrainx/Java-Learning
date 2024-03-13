package Mine.Basics;

public class MethodOverloading {

    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,int b){
        return a+b;
    }
    static int add(int a){
        return a*a;
    }



    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(23.4,12.44));
        System.out.println(add(2,3.4));
        System.out.println(add(2));
    }
}

