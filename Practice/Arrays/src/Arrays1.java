import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[1] = 100;
    }
}
