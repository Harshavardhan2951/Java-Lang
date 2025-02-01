import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int n = 0; n < num; n++) {
            arr[n] = input.nextInt();
        }
        sort_Algorithm(arr);
        for (int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\n" + totalTime + "ms.");
    }

    static void sort_Algorithm(int[] Numb) {
        for (int i = 0; i < Numb.length - 1; i++) {
            for (int j = 1; j <= Numb.length - i - 1; j++) {
                swap(Numb, j);
            }
        }
    }

    static void swap(int[] Numb, int j) {
        if (Numb[j] < Numb[j - 1]) {
            int temp = Numb[j];
            Numb[j] = Numb[j - 1];
            Numb[j - 1] = temp;
        }
    }
}
