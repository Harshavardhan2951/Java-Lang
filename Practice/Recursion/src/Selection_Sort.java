import java.util.Arrays;

class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 8, 2, 9, 7};
        Selection_Sort_Recursion(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection_Sort_Recursion(int[] arr, int row, int col, int element) {
        if(row == 0) {
            return;
        }
        if(col < row) {
             if(arr[element] < arr[col]) {
                 Selection_Sort_Recursion(arr, row, col + 1, col);
             }else {
                 Selection_Sort_Recursion(arr, row, col + 1, element);
             }
        }
        else {
            int temp = arr[row - 1];
            arr[row - 1] = arr[element];
            arr[element] = temp;
            Selection_Sort_Recursion(arr, row - 1, 0, 0);
        }
    }
}