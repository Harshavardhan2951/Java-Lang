/*https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/*/
public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(findRotationCount(arr));
    }

    static int findRotationCount(int[] arr) {
        int startIndex = 0, endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(arr[midIndex] > arr[midIndex + 1]) {
                return midIndex + 1;
            }
            else if(midIndex < endIndex && arr[midIndex] < arr[midIndex - 1]) {
                return midIndex;
            }
            else if(startIndex < midIndex && arr[midIndex] < arr[midIndex + 1]) {
                startIndex = midIndex + 1;
            } else if (arr[startIndex] > arr[startIndex + 1]) {
                return startIndex + 1;
            }else{
                return 0;
            }
        }return -1;
    }
}
