import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 10, 11, 12, 16, 18, 20, 36, 48};
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();
        System.out.println("The Target Element found in the Index: " + binarySearchApproach(arr, target));
    }

    static int binarySearchApproach(int[] Numb, int target) {
        int startIndex = 0, lastIndex = Numb.length - 1;
        while(startIndex <= lastIndex) {
            int mid = startIndex + (lastIndex - startIndex) / 2;
            if(target < Numb[mid]) {
                lastIndex = mid - 1;
            } else if (target > Numb[mid]) {
                startIndex = mid + 1;
            } else {
                return mid;
            }
        }return -1;
    }
}