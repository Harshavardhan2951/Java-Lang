import java.util.Scanner;

public class Rotated_Sort_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 0, 1, 2};
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = pivotSearch(arr);
        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }if(arr[pivot] == target) {
            return pivot;
        }if(target > arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target ,pivot + 1, arr.length - 1);
    }

    static int pivotSearch(int[] Numb) {
        int startIndex = 0, endIndex = Numb.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(Numb[midIndex] > Numb[midIndex + 1] && midIndex < endIndex) {
                return midIndex;
            }if(Numb[midIndex] < Numb[midIndex - 1] && midIndex > startIndex) {
                return midIndex - 1;
            }
            if(Numb[midIndex] <= Numb[startIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }return -1;
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
