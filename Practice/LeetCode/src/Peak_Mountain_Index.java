/*https://leetcode.com/problems/peak-index-in-a-mountain-array/description/*/
public class Peak_Mountain_Index {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 3, 2};
        int result = BinarySearch(arr);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr) {
        int startIndex = 0, endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            int plusIndex = midIndex + 1;
            if(arr[midIndex] < arr[plusIndex]) {
                startIndex = midIndex + 1;
            }else if(arr[midIndex] > arr[plusIndex]) {
                endIndex = midIndex - 1;
            }
        }return startIndex;
    }
}

