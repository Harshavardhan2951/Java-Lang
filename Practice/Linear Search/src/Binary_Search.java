import java.util.Scanner;

class Binary_Search {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,48};
        System.out.print("Enter the Target Element to find: ");
        int target = input.nextInt();
        int result = findIndex(arr, target);
        System.out.println(result);
    }

    static int findIndex(int[] Numb, int target) {
        int startIndex = 0;
        int lastIndex = Numb.length - 1;

        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target < Numb[midElement]) {
                lastIndex = midElement - 1;
            }
            else if(target > Numb[midElement]) {
                startIndex = midElement + 1;
            }
            else {
                System.out.print("Therefore the target Element found in the index of: ");
                return midElement;
            }
        }
        return -1;
    }
}