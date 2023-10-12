package Practice;

public class DeleteArray {
    public static void main(String[] args) {

        int[] array = {1,3, 5, 7, 10, 5, 6, 7};

        int[] arrayDemo = array;

        int delete = 0;

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] != array[i + 1]) {

                if (arrayDemo.length > 2) {

                    int[] newArray = new int[arrayDemo.length - 2];

                    for (int j = 0; j < newArray.length; j++) {
                        newArray[j] = arrayDemo[j];
                    }

                    arrayDemo = newArray;
                    for(int k=0;k<=arrayDemo.length-1;k++){
                        System.out.print(arrayDemo[k] +" ");
                    }
                    delete++;
                    delete++;
                    System.out.println();
                }
            }

        }
        System.out.println("No of Deletions = "+delete);


    }
}
