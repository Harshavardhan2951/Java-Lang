import java.util.Scanner;

/*https://leetcode.com/problems/first-bad-version/description/*/
public class isBadVersion  {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter the Target Number: ");
        int target = input.nextInt();

        int result = BinarySearch(arr, target);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr, int target) {
        int startIndex = 0, endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(target > arr[midIndex]) {
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex - 1;
            }
        }return startIndex;
    }
}
