package Array;

import java.util.ArrayList;

public class ArrayCollectionDataTypes {
    public static void main(String[] args) {
        Object[] array=new String[2];
        array[0]="Abi";
        array[1]="Aji";

        int a[]={10,20,30,40};

        for(int i =0;i<array.length;i++){
            Object show= array[i];
            System.out.print(show + " ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

//        System.out.println(array[1]);

        ArrayList<Object> list=new ArrayList<>();
        list.add(1);
        list.add("Ajith");

//        System.out.println(list);


    }
}
