import java.util.Scanner;

/*https://leetcode.com/problems/guess-number-higher-or-lower/description/*/
public class NumberGuess {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = GuessHighRlow(5, arr);
        System.out.println(result);
    }

    public static int GuessHighRlow(int n, int[] arr) {
        int startIndex = 0, endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(arr[midIndex] == n) {
                return midIndex;
            }else if(n > arr[midIndex]) {
                startIndex = midIndex + 1;
            }else if(n < arr[midIndex]) {
                endIndex = midIndex - 1;
            }
        }return -1;
    }
}
