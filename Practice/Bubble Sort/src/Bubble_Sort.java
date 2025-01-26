import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = {3, 1, 5, 4, 2};
        ApplyBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime = System.currentTimeMillis();
        long totatTime = endTime - startTime;
        System.out.println("totalTime: " + totatTime);
    }

    static void ApplyBubbleSort(int[] Numb) {
        //Run the steps N-1 Times
        for (int i = 0; i < Numb.length; i++) {
            //For each step max item will swap to the least element index
            for (int j = 1; j < Numb.length - i; j++) {
                //Swap if the number is less than the previous item
                if(Numb[j] < Numb[j - 1]) {
                    //swap
                    int temp = Numb[j];
                    Numb[j] = Numb[j - 1];
                    Numb[j - 1] = temp;
                }
            }
        }
    }
}
