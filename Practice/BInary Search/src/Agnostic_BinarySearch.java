import java.util.Scanner;

class Agnostic_BinarySearch {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8, 9, 10, 11, 12, 16, 18, 20, 36, 48};
        int[] arr = {99,87,55,54,52,44,43,30,20,19};
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();
        System.out.println(AgnorsticBinary(arr, target));
    }

    static int AgnorsticBinary(int[] Numb, int target) {
        int startIndex = 0, lastIndex = Numb.length - 1;
        /*Find wheather the Array is sorted in Descending or Ascending Order*/
        boolean conclusion = Numb[startIndex] < Numb[lastIndex];

        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target == Numb[midElement]) {
                return  midElement;
            }

            if(conclusion) {
                if(target > Numb[midElement]) {
                    startIndex = midElement + 1;
                } else if (target < Numb[midElement]) {
                    lastIndex = midElement - 1;
                }
            }else {
                if(target < Numb[midElement]) {
                    startIndex = midElement + 1;
                } else if (target > Numb[midElement]) {
                    lastIndex = midElement - 1;
                }
            }

        }return -1;
    }
}

