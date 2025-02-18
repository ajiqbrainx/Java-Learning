package ETI.Array;

public class IndexReturn {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int findValue = 50;
        for (int index = 0; index < array.length; index++) {

            if (findValue == array[index]) {
                System.out.println(findValue + " index is " + index);
                break;
            }
        }
    }
}
