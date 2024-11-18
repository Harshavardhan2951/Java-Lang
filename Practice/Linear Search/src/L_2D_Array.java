import java.util.Arrays;

public class L_2D_Array {
    public static void main(String[] args) {
        int[][] Numb = {
                {1, 2, 3, 4},
                {2, 3},
                {4, 6, 8}
        };
        int[] result = LinearSearch_2D(Numb, 3);
        System.out.println(Arrays.toString(result));

    }

    static int[] LinearSearch_2D(int[][] Numb, int target) {
        for (int row = 0; row < Numb.length; row++) {
            for (int column = 0; column < Numb[row].length; column++) {
                if(Numb[row][column] == target) {
                    return new int[] {row, column};
                }
            }
        }return new int[]{-1};
    }
}
