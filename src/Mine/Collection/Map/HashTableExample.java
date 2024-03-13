package Mine.Collection.Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,Integer>hashtable=new Hashtable<>();
        hashtable.put("Ajith",23);
        hashtable.put("Abi",24);
        hashtable.put(null,25);


        System.out.println(hashtable);
    }
}
