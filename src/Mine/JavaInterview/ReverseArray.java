package JavaInterview;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int[] output = new int[array.length];
        reverseArray(array, array.length - 1, 0, output);


        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    static int[] reverseArray(int[] array, int length, int index, int[] output) {

        if (length >= 0) {
            output[index] = array[length];
            return reverseArray(array, length - 1, index + 1, output);
        } else {
            return output;
        }

    }
}
