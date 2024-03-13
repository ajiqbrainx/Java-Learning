package Mine.Coding;


public class PairCount {
    public static void main(String[] args) {
        int[] array = {10, 10, 20, 30, 20, 30, 40, 50, 60, 50, 100};

        int pair = 0;

        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) pair += 1;
            }
        }
        System.out.println(pair);


    }
}
