import java.util.ArrayList;
import java.util.Arrays;

public class Range_Array {
    public static void main(String[] args) {
        int[] NumbArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = RangeofArray(NumbArray, 5, 1, 4);
        System.out.println(result);
    }
    static int RangeofArray(int[] Numb, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if(target == Numb[i]) {
                return i;
            }
        }return -1;
    }
}
