import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3};
        sort_Algorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort_Algorithm(int[] Numb) {
        for (int i = 0; i < Numb.length; i++) {
            for (int j = 1; j <= Numb.length - i - 1; j++) {
                if (Numb[j] < Numb[j - 1]) {
                    int temp = Numb[j];
                    Numb[j] = Numb[j - 1];
                    Numb[j - 1] = temp;
                }
            }
        }
    }
}
