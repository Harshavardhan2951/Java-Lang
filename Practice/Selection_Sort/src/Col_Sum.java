import java.util.Arrays;

public class Col_Sum {
    public static void main(String[] args) {
        int[][] Numb = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = Col_Summ(Numb);
        System.out.println(Arrays.toString(result));
    }

    static int[] Col_Summ(int[][] Numb) {
        int count = 0;
        int end = Numb.length - 1;
        int[] error = {-1, -1};
        for (int i = 0; i < Numb.length - 1; i++) {
            for (int j = 0; j <= Numb.length - 1; j++) {
                count += Numb[j][i];
                if(count == 12) {
                    return new int[]{j, i};
                }
            }
        }
        return error;
    }
}
