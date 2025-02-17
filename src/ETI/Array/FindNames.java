package ETI.Array;

import java.util.Arrays;

public class FindNames {
    public static void main(String[] args) {

        String[] array = {"messileo37", "johndoe24", "johnwick40"};
        String FirstName = "messi";
        String LastName = "leo";
        int Age = 37;

       var output= Arrays.stream(array).filter(f -> f.equals(FirstName + LastName + Age)).findFirst();

        System.out.println(output.get());
    }
}
