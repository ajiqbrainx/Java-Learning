package Mine.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(120);
        list1.add(200);
        list1.add(100);

        list.add(12);
        list.add(2);
        list.add(1);
        list.add(43);
        list.add(5);
        list.addAll(list1);

        try {
            list.set(10,100);
        }catch (Exception e){
            System.out.println("Its not present"+e);
        }

        System.out.println(list);
//        if(!list.get(10).toString().isEmpty()){
//            System.out.println("Its present");
//        }
//        System.out.println(list);
//
//        System.out.println(list.stream().sorted().collect(Collectors.toList()));

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) > list.get(j)) {
//                    int temp= list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }
//        System.out.println(list);
    }
}
