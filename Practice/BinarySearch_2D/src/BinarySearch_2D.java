import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_2D {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] Arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 39, 48},
                {32, 33, 42, 53},
                {61, 62, 63, 64}
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
        int cols = Numb[0].length;//because if there is change in the matrix length
        int rowStart = 0, rowEnd = rows - 1, cmid = (cols - 1) / 2;

        //This part of Code applies within the o(log(n)) for the specific midRow and reduces the Array to two sized Array
        while(rowStart < (rowEnd - 1)) {
            int midIndex = rowStart + (rowEnd - rowStart) / 2;
            if(Numb[midIndex][cmid] == target) {
                return new int[]{midIndex, cmid};
            }
            if(Numb[midIndex][cmid] > target) {
                rowEnd = midIndex - 1;
            }
            else {
                rowStart = midIndex + 1;
            }
        }//Since commited to the two rows now apply binary search and find the target in the Index by using the available parts
        if(Numb[rowStart][cmid] == target) return new int[]{rowStart, cmid};

        if(rowStart + 1 < rows && Numb[rowStart + 1][cmid] == target) return new int[]{rowStart + 1, cmid};

        //Apply Number of possible parts to get the target value directly
        //First Part
        if (target <= Numb[rowStart][cmid - 1]) {
            return BinarySearch(Numb, rowStart, 0, cmid - 1, target);
        }
        // Second Half
        if (target >= Numb[rowStart][cmid + 1] && target <= Numb[rowStart][cols - 1]) {
            return BinarySearch(Numb, rowStart, cmid + 1, cols - 1, target);
        }
        // Third Half
        if (rowStart + 1 < rows && target <= Numb[rowStart + 1][cmid - 1]) {
            return BinarySearch(Numb, rowStart + 1, 0, cmid - 1, target);
        }
        // Fourth Half
        if (rowStart + 1 < rows) {
            return BinarySearch(Numb, rowStart + 1, cmid + 1, cols - 1, target);
        }

        return new int[]{-1, -1}; // Target not found

    }
}
