
import java.util.Scanner;

/*https://leetcode.com/problems/find-in-mountain-array/description/*/
public class Mountain_Array {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.print("Enter the target Element: ");
        int target = input.nextInt();

        int result = BinarySearch(arr, target);
        System.out.println(result);

    }

    static int BinarySearch(int[] Numb, int target) {
        int startIndex = 0, endIndex = Numb.length - 1;
        while(startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if(target > Numb[midIndex]) {
                startIndex = midIndex + 1;
            }
            else if(target < Numb[midIndex]) {
                endIndex = midIndex;
            }else {
                return startIndex;
            }
        }return -1;
    }
}
