public class sqrt_x {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        System.out.println(sqrt(arr, target));
    }

    //Applied O(N) time complexity
    static int sqrt(int[] Numb, int target) {
        for(int x : Numb) {
            if(x * x == x) {
                return x;
            } else if ((x*x != target) && (target / x <= target) && (x*x > target)) {
                return x - 1;
            }
        }return -1;
    }
}
