class reverseNumb_Type_2 {
    static int ans = 0;
    public static void main(String[] args) {
        int n = 98479;
        reverseNumb(n);
        System.out.println(ans);
    }

    static void reverseNumb(int n) {
        int size = (int)(Math.log10(n) + 1);
        helper(n, size);
    }

    static int helper(int n, int size) {
        int rem;
        if(n % 10 == 0) {
            return n;
        }
        rem = n % 10;
        ans += (int)(rem * Math.pow(10, size - 1));
        return helper(n / 10, size - 1);
    }
}