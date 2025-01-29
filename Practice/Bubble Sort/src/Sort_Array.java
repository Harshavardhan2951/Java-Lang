import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        sort_Algorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort_Algorithm(int[] Numb) {
        for (int i = 0; i < Numb.length - 1 ; i++) {
            for (int j = 1; j < Numb.length - i; j++) {
                if (Numb[j] < Numb[j - 1]) {
                    int temp = Numb[j];
                    Numb[j] = Numb[j - 1];
                    Numb[j - 1] = temp;
                }
            }
        }
    }
}
