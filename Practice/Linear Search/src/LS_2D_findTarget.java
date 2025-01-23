import java.util.Arrays;
import java.util.Scanner;

public class LS_2D_findTarget {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int[][] arr = {
                {10, 20, 30},
                {40, 45, 46, 49},
                {50, 52, 54}
        };
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();

        System.out.println(Arrays.toString(LinearSearch(arr, target)));
        final long EndTime = System.currentTimeMillis();
        final long TotalTime = (EndTime - startTime);
        System.out.println(TotalTime + "ms");
    }

    static int[] LinearSearch(int[][] arr, int target) {
        //Apply O(n) complexity
        for (int row = 0; row <= arr.length - 1; row++) {
            for (int col = 0; col <= arr[row].length - 1; col++) {
                if(target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }return new int[]{-1, -1};
    }
}
