class Fibonnaci {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int ans = Fibo(45);
        System.out.println(ans);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
    public static int Fibo(int n) {
        //Rule 1 : Write the Base Condition
        if(n <= 1) {
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
}