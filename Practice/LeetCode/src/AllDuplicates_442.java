import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/find-all-duplicates-in-an-array/*/
public class AllDuplicates_442 {
    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(num));
    }

    static List<Integer> findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            int check = nums[i] - 1;
            if (nums[i] != nums[check]) {
                swap(nums, i, check);
            } else {
                i++;
            }
        }
        List<Integer> sol = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                sol.add(nums[i]);
            }
        }return sol;
    }


    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
