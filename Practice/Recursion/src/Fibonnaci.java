class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    static int fib(int n) {
        if(n < 45) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}