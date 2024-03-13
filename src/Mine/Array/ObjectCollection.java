package Mine.Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ObjectCollection {
//    String name =new String("Ajith");
//    Integer age=new Integer(23);
//    Double percentge=new Double(23.3);


    public static void main(String[] args) {
        Collection<String>name=new ArrayList<>();
        name.add("Ajith");
        Collection<Integer>age=new ArrayList<>();
        age.add(21);
        if(name.contains("Ajith")) System.out.println("Your name is Correct");
        else System.out.println("Your name is InCorrect");
        if(age.contains(23)) System.out.println("Your Age is Correct");
        else System.out.println("Your Age is InCorrect");

        Collection<String>names= List.of("Ajith","Ashok","Abi");

        System.out.println(names);
       String large[]={"Ajith","Ashok","Abi"};

        System.out.println("&&&&&&&&&&&&&&&&&&&");
        System.out.println(names.toString().equals(large));

    }

}
