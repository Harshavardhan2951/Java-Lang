import java.util.Arrays;

public class Merge_Sort_Recursion {
    public static void main(String[] args) {
        int[] Numb = {89, 45, 68, 90, 29, 17, 4, 32, 100, 73, 56, 38, 99, 15, 1, 50, 77, 22};
        Numb = MergeSort(Numb);
        System.out.println(Arrays.toString(Numb));
    }

    static int[] MergeSort(int[] arr) {
        int end = arr.length;
        if(end == 1) {
            return arr;
        }
        int midElement = end / 2;
        int[] leftArray = MergeSort(Arrays.copyOfRange(arr, 0, midElement));
        int[] rightArray = MergeSort(Arrays.copyOfRange(arr, midElement, arr.length));
        return helperSort(leftArray, rightArray);
    }

    static int[] helperSort(int[] left, int[] right) {
        int[] sum = new int[left.length + right.length];
        int lIndex = 0, rIndex = 0, k = 0;

        while(lIndex < left.length && rIndex < right.length) {
            if(left[lIndex] < right[rIndex]) {
                sum[k] = left[lIndex];
                lIndex++;
            }else {
                sum[k] = right[rIndex];
                rIndex++;
            }
            k++;
        }
        while(lIndex < left.length) {
            sum[k] = left[lIndex];
            lIndex++;
            k++;
        }
        while(rIndex < right.length) {
            sum[k] = right[rIndex];
            rIndex++;
            k++;
        }
        return sum;
    }
}
