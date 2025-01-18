import java.util.Arrays;

public class findTarget {
    public static void main(String[] args) {
        int[][] Arr = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        System.out.println(Arrays.toString(TargetNumber(Arr, 91)));

    }

    static int[] TargetNumber(int[][] Numb, int target) {
        for(int row=0; row<=Numb.length - 1; row++) {
            for(int col=0; col<=Numb[row].length - 1; col++) {
                if(Numb[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
