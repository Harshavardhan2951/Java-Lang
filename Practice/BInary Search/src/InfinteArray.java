import java.util.Scanner;

public class InfinteArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*Consider an Example Array here.... assume the given array as infinite size*/
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();

        int result = findTargetNumber(arr, target);
        System.out.println(result);
    }

    static int findTargetNumber(int[] Numb, int target) {
        int startIndex = 0, lastIndex = 1, size = (startIndex - lastIndex);
        while(target > Numb[lastIndex]) {
            startIndex = lastIndex + 1;
            lastIndex = (startIndex * 2) + size;
        }return binarySearch(Numb, target, startIndex, lastIndex);
    }

    static int binarySearch(int[] Numb, int target, int startIndex, int lastIndex) {
        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target < Numb[midElement]) {
                lastIndex = midElement - 1;
            }
            else if(target > Numb[midElement]) {
                startIndex = midElement + 1;
            }
            else {
                return midElement;
            }
        }
        return -1;
    }
}
