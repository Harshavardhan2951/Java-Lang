/*https://leetcode.com/problems/find-the-duplicate-number/*/
public class DuplicateNumber_287 {
    public static void main(String[] args) {
        int[] Number = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(Number));
    }

    public static int findDuplicate(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length;) {
            if(nums[i] != i+1) {
                int vars = nums[i] - 1;
                if(nums[i] != nums[vars]) {
                    swap(nums, i, vars);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }return ans;
    }

    static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
