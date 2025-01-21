import java.util.Arrays;
import java.util.Scanner;

public class findTargetBS {
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
        System.out.println(Arrays.toString(BinarySearch2D(arr, target)));
    }

    static int[] BinarySearch(int[][] Numb, int target, int row, int colStart, int colEnd) {
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

    /*Apply using Binary Search*/
    static int[] BinarySearch2D(int[][] Numb, int target) {
        int[] error = {-1, -1};
        int row = Numb.length, col = Numb[0].length;
        if(row == 1) {
            System.out.println(Arrays.toString(BinarySearch(Numb, target, 0, 0, Numb[0].length - 1)));
        }

        //Run the Loop till 2 rows are remaining
        int rowStart = 0, rowEnd = Numb.length - 1, midCol = col / 2;
        while(rowStart < (rowEnd - 1)) {
            int midElement = rowStart + (rowEnd - rowStart) / 2;
            if(Numb[midElement][midCol] == target) {
                return new int[]{midElement, col};
            } else if (Numb[midElement][midCol] < target) {
                rowStart = midElement;
            }else {
                rowEnd = midElement;
            }
        }
        if(Numb[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        }if(Numb[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }

        //First Half
        if(target <= Numb[rowStart][midCol - 1]) {
            return BinarySearch(Numb, target, rowStart, 0,midCol - 1);
        }
        //Second Half
        if(target >= Numb[rowStart][midCol + 1] && target <= Numb[rowStart][col - 1]) {
            return BinarySearch(Numb,target, rowStart, midCol + 1, col - 1);
        }
        //Third Half
        if(target <= Numb[rowStart + 1][midCol - 1]) {
            return BinarySearch(Numb,target, rowStart + 1, 0, midCol - 1);
        }
        //Fourth Half
        else {
            return BinarySearch(Numb,target, rowStart + 1, midCol + 1, col - 1);
        }
    }
}
