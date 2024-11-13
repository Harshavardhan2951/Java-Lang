import java.util.Arrays;
import java.util.Scanner;

class ArrayPassingFunctions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numb = {1, 2, 3, 4};
        displayNumb(numb);
    }

    static void displayNumb(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}