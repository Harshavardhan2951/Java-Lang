
public class Reverse_Number {

    public static void main(String[] args) {
        int n = 12345;
        ReverseRecursion(n);
        System.out.println(ans);
    }

    static int ans = 0;

    static void ReverseRecursion(int n) {
        if(n == 0) {
            return;
        }
        int remainder =  n%10;
        ans = ans * 10 + remainder;
        ReverseRecursion(n/10);
    }
}
