import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

/*https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/*/
public class Two_Sum_II_167 {
    public static void main(String[] args) {
        int[] arr = {2,3, 4}; //1, 2,3, 4, 5, 6, 8
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] Numb, int target) {
        int start=0, end=Numb.length;
        while(true) {
            if(Numb[start] + Numb[end - 1] == target) {
                return new int[]{start + 1, end};
            } else if (Numb[start] + Numb[end - 1] > target) {
                end--;
            }else {
                start++;
            }
        }
    }
}
