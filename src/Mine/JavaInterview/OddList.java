package JavaInterview;

import java.util.ArrayList;

public class OddList {
    static void oddNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i) + " It is Even number");
            } else System.out.println(list.get(i) + " It is Odd number");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        oddNumber(list);
      boolean ss=  list.parallelStream().anyMatch(number -> number % 2 != 0);
        System.out.println(ss);
    }
}
