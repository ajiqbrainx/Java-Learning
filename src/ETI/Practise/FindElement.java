package ETI.Practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindElement {
    public static void main(String[] args) {

        int[] array = {2, 3, 4};
        int check = 1;

        IntStream.iterate(0,i->i+2)
                        .limit(5)
                                .mapToObj(String::valueOf)
                                        .forEach(System.out::println);


//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] == check) {
//                check++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(check);
    }
}
