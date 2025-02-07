/*https://leetcode.com/problems/first-missing-positive/description/*/
public class missingPositive_41 {
    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(firstMissingPositive(array));
    }

    public static int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int vars = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[vars]) {
                swap(nums, i, vars);
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }return nums.length + 1;
    }

    static void swap(int[] Numb, int start, int end) {
        int temp = Numb[start];
        Numb[start] = Numb[end];
        Numb[end] = temp;
    }
}
