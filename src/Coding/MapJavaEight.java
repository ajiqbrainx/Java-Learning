package Coding;

import java.util.*;
import java.util.stream.Collectors;

public class MapJavaEight {
    public static void main(String[] args) {

        String str = "Name=Hema,Age=26,Company=Qbrainx";


        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee(10, "Anand", "CS");
        Employee emp1 = new Employee(12, "Ajith", "CSE");
        Employee emp2 = new Employee(14, "Ram", "CS");

        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        System.out.println(employeeList);


        var countCSE = employeeList.stream().filter(f -> f.department.equals("CSE")).count();

        HashMap<String, Long> map = new HashMap<>();

        map.put("CSE", countCSE);


        System.out.println(map);
        var a = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(a);
        var b = employeeList.stream().map(Employee::getDepartment).collect(Collectors.toList());
        System.out.println(b);
    }

}
