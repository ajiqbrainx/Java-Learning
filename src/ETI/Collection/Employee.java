package ETI.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


class Emp {
    int salary;
    String name;

    Emp(int salary,String name){
        this.name=name;
        this.salary=salary;

    }

}


public class Employee {


    public static void main(String[] args) {
        List<Emp>empList=new ArrayList<>();
        empList.add(new Emp(1000,"Ajith"));
        empList.add(new Emp(2000,"Akil"));
        empList.add(new Emp(3000,"Gopi"));
        empList.add(new Emp(900,"Nair"));
        empList.add(new Emp(500,"Sam"));

        empList.stream().filter(f->f.salary>1000).forEach(f-> System.out.println(f.name+" is salary is greater than 1000 "+ f.salary));





    }
}
