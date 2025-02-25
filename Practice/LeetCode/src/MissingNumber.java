/*https://leetcode.com/problems/missing-number/*/
public class MissingNumber {
    public static void main(String[] args) {
        int[] Numb = {3, 0, 1};
        System.out.println(missingNumber(Numb));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]) {
//                int temp = nums[i];
//                nums[i] = nums[nums[i]];
//                nums[nums[i]] = temp;
                swap(nums, i, nums[i]);
            }else {
                 i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }return nums.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

