package Mine.Coding;

import java.util.*;

public class MapKey {
    public static void main(String[] args) {
        String str = "Name=Hema,Age=26,Company=Qbrainx";

        List<String> list = new ArrayList<>();

        String[] array = str.split(",");

        Collections.addAll(list, array);

        Map<String, String> map = new HashMap<>();

        StringBuilder  key =new StringBuilder();
        StringBuilder ActualValue=new StringBuilder();
        boolean enable=false;
        for (int i = 0; i < list.size(); i++) {

            int length = list.get(i).length()-1;
            for (int j = 0; j < list.get(i).length(); j++) {
                boolean value = list.get(i).charAt(j) == '=';
                if(value){
                    enable=true;
                }
                if (list.get(i).charAt(j) != '=' && !enable) {
                    key.append(list.get(i).charAt(j));
                } else {
                    if(list.get(i).charAt(j) != '='){
                        ActualValue.append(list.get(i).charAt(j));
                    }
                    if (j==length){
                        map.put(key.toString(),ActualValue.toString());
                        key.setLength(0);
                        ActualValue.setLength(0);
                        enable=false;
                    }else {
                        enable=true;
                    }
                }
            }

        }

        System.out.println(map);

    }
}
