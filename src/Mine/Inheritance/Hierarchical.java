package Mine.Inheritance;

public class Hierarchical {
    int a,b;
}
class Add extends Hierarchical{
    Add(int aa,int bb){
        a=aa;
        b=bb;
    }
   void add(){
        int c = a+b;
        System.out.println("Adding values is = "+c);
    }
}
class Square extends Hierarchical{
    Square(int aa){
        a=aa;
    }
    void square(){
        int c=a*a;
        System.out.println("Square of the value is = "+c);
    }
}
class Cube extends Hierarchical{
    Cube(int aa){
        a=aa;
    }
    void cube(){
        int c=a*a*a;
        System.out.println("Cube of the value is = "+c);
    }
}
class Main3{
    public static void main(String[] args) {
        Add add=new Add(23,44);
        add.add();
        Square square=new Square(2);
        square.square();
        Cube cube=new Cube(2);
        cube.cube();

    }
}
