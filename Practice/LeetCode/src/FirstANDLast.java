import java.util.Scanner;

/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/*/
public class FirstANDLast {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();

        int[] Numb = {5, 7, 7, 8, 8, 10};
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = BinarySearch(nums, target, true);
        ans[1] = BinarySearch(nums, target, false);

        return ans;

    }

    int BinarySearch(int[] nums, int target, boolean findStartIndex) {
        int startIndex = 0, endIndex = nums.length - 1,ans = -1;

        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(target > nums[midIndex]) {
                startIndex = midIndex + 1;
            } else if (target < nums[midIndex]) {
                endIndex = midIndex - 1;
            }else {
                ans = midIndex;
                if(findStartIndex) {
                    endIndex = midIndex - 1;
                }else {
                    startIndex = midIndex + 1;
                }
            }
        }return ans;
    }
}
