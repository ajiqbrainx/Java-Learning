package Practice;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 5, 6, 7, 6};
        int[] b = new int[a.length];
        int index = 0;


        for (int i = 0; i <= a.length - 1; i++) {
            boolean numberIsPresent = false;
            for (int j = 0; j <= b.length - 1; j++) {
                if (b[j] == a[i]) {
                    numberIsPresent = true;
                    break;
                }
            }
            if (!numberIsPresent) {
                b[index] = a[i];
                index++;
            }

        }
        System.out.println("Old Array ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("New Array -> Remove Duplicates  ");
        for (int i = 0; i < index; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
