package LeetCode;

import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {1,1}};

        int add = Arrays.stream(grid[0]).sum();

        if (grid.length > 1) {

            for (int i = 1; i < grid.length; i++) {
                int lastValue = grid[i][grid[i].length-1];
                add = add + lastValue;

            }
        }

        System.out.println(add);

    }
}
