package ETI.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    public static void generatePermutations(int[] array, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == array.length) {
            result.add(new ArrayList<>(tempList)); // Add a copy of tempList to result
            return;
        }

        for (int num : array) {
            if (tempList.contains(num)) continue; // Skip duplicates
            tempList.add(num);
            generatePermutations(array, tempList, result);
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(array, new ArrayList<>(), result);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }



    }

}
