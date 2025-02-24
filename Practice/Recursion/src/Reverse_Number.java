public class Reverse_Number {
    public static void main(String[] args) {
        int n = 31000;
        System.out.println(ReverseRecursion(n));
    }

    static int ReverseRecursion(int n) {
        int ans = 0;
        if(n % 10 == n) {
            return n;
        }
        int remainder =  (n%10);
        ans += remainder;
        System.out.print(ans);
        return ReverseRecursion(n/10);
    }
}
