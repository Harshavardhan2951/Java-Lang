import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        int low = start, high = end;
        int pivot = start + (end - start) / 2;
        if(start >= end) {
            return;
        }
        while(start <= end) {
            while(arr[start] < arr[pivot]) {
                start++;
            }
            while(arr[pivot] < arr[end]) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }
}
