import java.util.Arrays;
import java.util.Scanner;

public class findTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 39, 48},
                {32, 33, 42, 53}
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Enter the Target Element to find: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] Numb, int target) {
        int row = 0;
        int col = Numb.length - 1;

        while(row < Numb.length && col > 0) {
            if (Numb[row][col] == target) {
                return new int[]{row, col};
            } else if (Numb[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
