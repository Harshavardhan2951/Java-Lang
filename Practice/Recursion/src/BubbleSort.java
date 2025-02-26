import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] Numb = {4, 3, 2, 1};
        BubbleSortApproach(Numb, Numb.length - 1, 0);
        System.out.println(Arrays.toString(Numb));
    }

    static void BubbleSortApproach(int[] arr, int start, int end) {
        if(start == 0) {
            return;
        }
        if(end < start) {
            if(arr[end] > arr[end + 1]) {
                int temp = arr[end];
                arr[end] = arr[end + 1];
                arr[end + 1] = temp;
            }
            BubbleSortApproach(arr,start, end + 1);
        }else {
            BubbleSortApproach(arr, start - 1, 0);
        }
    }
}
