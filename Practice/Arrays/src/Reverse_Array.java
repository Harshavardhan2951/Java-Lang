import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,0,2, 3};
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void ReverseArray(int[] arr) {
        int end = arr.length - 1, start = 0;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//    static int swap(int[] arr, int startIndex, int endIndex) {
//        int temp =
//    }
}
