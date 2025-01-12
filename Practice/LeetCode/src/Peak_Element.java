public class Peak_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 3, 2};
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    public static int findPeakElement(int[] nums) {
        int startIndex = 0, endIndex = nums.length - 1;
        while(startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            int plusIndex = midIndex + 1;
            if(nums[midIndex] > nums[plusIndex]) {
                endIndex = midIndex;
            }else {
                startIndex = midIndex + 1;
            }
        }return startIndex;
    }
}
