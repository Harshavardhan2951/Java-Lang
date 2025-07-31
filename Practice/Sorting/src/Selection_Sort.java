import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] Numb = {5, 2, 1, 3, 4};
        //Selection Sort Implementation
        //First Step: Select the highest element in the array

        System.out.println(Arrays.toString(Numb));
    }

    static void Selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
        }
    }

    static int getMaxIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if(arr[max] <arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
