import java.util.Arrays;

/*https://leetcode.com/problems/set-mismatch/description/*/
public class setmismatch_645 {
    public static void main(String[] args) {
        int[] array = {1,2,2,4};
        int[] result = findErrorNums(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        for(int i=0; i<nums.length; i++) {

            int vars = nums[i] - 1;
            if (nums[i] != nums[vars]) {
                swap(nums, i, vars);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                return new int[]{nums[i], i+1};
            }
        }return new int[]{-1, -1};
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
