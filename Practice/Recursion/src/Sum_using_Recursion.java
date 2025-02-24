public class Sum_using_Recursion {
    public static void main(String[] args) {
        int n = 3355;
        System.out.println(RecursiveSum(n));
    }

    static int RecursiveSum(int n) {
        if(n == 0) {
            return n;
        }
        return RecursiveSum(n / 10) + (n % 10);
    }
}
