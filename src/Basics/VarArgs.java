package Basics;

public class VarArgs {
    static void getName(String...  name){
//        System.out.println(name[0]);
        for(String names:name){
            System.out.println(names);
        }
    }

    public static void main(String[] args) {
        getName("Ajith","Ashok","Abi","Achuuu");
    }
}
