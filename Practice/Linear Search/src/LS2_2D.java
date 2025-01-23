import java.util.Arrays;
import java.util.Scanner;

public class LS2_2D {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        final long startTime = System.currentTimeMillis();
        int[][] arr = {
                {10, 20, 30},
                {40, 45, 46},
                {50, 52, 54}
        };
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();

        System.out.println(Arrays.toString(LinearSearch(arr, target)));
//        final long EndTime = System.currentTimeMillis();
//        final long TotalTime = (EndTime - startTime);
//        System.out.println(TotalTime + "ms");
    }

    //Apply O(NXN) Complexity
    static int[] LinearSearch(int[][] Numb, int target) {
        int rowStart = 0, rowEnd = Numb.length - 1;
        while(rowStart < Numb.length && rowEnd > 0) {

            if(Numb[rowStart][rowEnd] == target) {
                return new int[]{rowStart, rowEnd};
            }
            if(Numb[rowStart][rowEnd] < target) {
                rowStart++;
            } else {
                rowEnd--;
        }
        }return new int[]{-1, -1};
    }
}
