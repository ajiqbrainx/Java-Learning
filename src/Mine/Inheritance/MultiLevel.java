package Mine.Inheritance;

public class MultiLevel {
    void grandpa(){
        System.out.println("Grandpa ....here");
    }
}
class Father extends MultiLevel{
    void father(){
        System.out.println("Father....here");
    }
}
class Son extends Father{
    void son(){
        System.out.println("Son....here");
    }
}

class Main1{
    public static void main(String[] args) {
        Son son=new Son();
        son.son();;
        son.father();
        son.grandpa();
    }
}