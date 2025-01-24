import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_2D {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] Arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 39, 48},
                {32, 33, 42, 53}
        };
        int target = input.nextInt();
        System.out.println(Arrays.toString(findTargetElement(Arr, target)));
    }

    static int[] BinarySearch(int[][] Numb, int row, int colStart, int colEnd, int target) {
        while(colStart <= colEnd) {
            int midIndex = colStart + (colEnd - colStart) / 2;
            if(Numb[row][midIndex] < target) {
                colStart = midIndex + 1;
            } else if (Numb[row][midIndex] > target) {
                colEnd = midIndex - 1;
            }else {
                return new int[]{row, midIndex};
            }
        }return new int[]{-1, -1};
    }

    static int[] findTargetElement(int[][] Numb, int target) {
        int rows = Numb.length;
        int cols = Numb[0].length;// Be aware the matrix may be empty
        int rowStart = 0, rowEnd = rows - 1, cmid = cols / 2;
        System.out.println(cols);

        //Run the Loop till you get the 2 rows
        while(rowStart < (rowEnd - 1)) {
            int midIndex = rowStart + (rowEnd - rowStart) / 2;
            if(target == Numb[midIndex][cmid]) {
                return new int[]{midIndex, cmid};
            }if(target > Numb[midIndex][cmid]) {
                rowStart = midIndex;
            }else {
                rowEnd = midIndex;
            }
        }
        //Since we had the last rows and their binary search approach successfully
        //check whether the target is in the column of the two rows
        if(Numb[rowStart][cmid] == target) {
            return new int[]{rowStart, cmid};
        } if(Numb[rowStart + 1][cmid] == target) {
            return new int[]{rowStart + 1, cmid};
        }
        //First Part
        if(target <= Numb[rowStart][cmid - 1]) {
            return BinarySearch(Numb, rowStart, 0, cmid - 1, target);
        }
        //Second Part
        if(target >= Numb[rowStart][cmid + 1] && target <= Numb[rowStart][cols - 1]) {
            return BinarySearch(Numb, rowStart, cmid + 1, cols - 1, target);
        }
        //Third Part
        if(target <= Numb[rowStart + 1][cmid - 1]) {
            return BinarySearch(Numb, rowStart + 1, 0, cmid - 1, target);
        }
        //Fourth Part
        else {
            return BinarySearch(Numb, rowStart + 1, cmid + 1, cols - 1, target);
        }
    }
}
