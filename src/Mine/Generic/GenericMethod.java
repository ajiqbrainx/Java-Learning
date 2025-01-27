package Mine.Generic;

class Method {

//    to accept all types of types string , int ,float
    public <S> void printMethod(S anyType){
        System.out.println("you enter the :"+ anyType);
        System.out.println("Data type: " + anyType.getClass().getName()); // Prints the class name (data type)

    }
}

public class GenericMethod {

    public static void main(String[] args) {

        Method method = new Method();
        method.printMethod("Ajith");
        method.printMethod(12);
        method.printMethod(12.3);
    }
}
