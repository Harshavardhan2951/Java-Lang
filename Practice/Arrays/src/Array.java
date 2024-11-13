import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {21, 22, 24, 26 ,37};
        /*Input using For Loops*/
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

        System.out.println(Arrays.toString(arr));
    }
}
