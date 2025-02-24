// Count the Number of times 0 occured
public class Count_Numbers {
    static int count = 0;
    public static void main(String[] args) {
        int n = 1000210;
        System.out.println("Count: " + Count(n));
    }

    static int Count(int n) {
        return helper(n, count);
    }

    static int helper(int n, int count) {
        if(n == 0) {
            return count;
        }
        int remainder = n % 10;
        if(remainder == 0) {
            return helper(n / 10, count + 1);
        }else {
            return helper(n / 10, count);
        }
    }
}
