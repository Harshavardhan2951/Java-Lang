import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] array = {2, 5, 5, 11};
        int[] result = twoSum(array, 10);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }return new int[]{-1, -1};
    }
}
