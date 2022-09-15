package Basics;

public class VarArgs {

    int age;
    String name;

    VarArgs(int age, String name) {
        this.age = age;
        this.name = name;

    }

    static void getName(String... name) {
//        System.out.println(name[0]);
        for (String names : name) {
            System.out.println(names);
        }
    }

//    static void name(String... name) {
//        System.out.println(name);
//    }

    public static void main(String[] args) {
        getName("Ajith", "Ashok", "Abi", "Achuuu");
//        name("Ajith", "affd");

//        int a[] = {1, 2, 3};
//
//
//
//        System.out.println(a[0])

        VarArgs varArgs[] = new VarArgs[3];
         varArgs[0]= new VarArgs(23,"Ajith");
        varArgs[1]= new VarArgs(24,"Ajith");
        varArgs[2]= new VarArgs(25,"Ajith");

        System.out.println(varArgs);


    }
}
