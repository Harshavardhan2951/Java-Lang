public class FindNoofSteps_1342 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(numberOfSteps(a));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int steps) {
        if(n == 0) {
            return steps;
        }
        if(n % 2 == 0) {
            return helper(n / 2, steps + 1);
        }else  {
            return helper(n - 1, steps + 1);
        }
    }
}
