class Fibonnaci {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        int ans = Fibo(45);
//        System.out.println(ans);
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
        System.out.println(FibFormula(50));
    }

    static int FibFormula(int n) {
        return (int) ((Math.pow(((1+Math.sqrt(5)) / 2), n) - Math.pow(((1-Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static int Fibo(int n) {
        //Rule 1 : Write the Base Condition
        if(n <= 1) {
            return n;
        }
        /*
        * 1)First Goes with the Fibo(n-1) it goes until end of them till 0 that is Fibo[0]
        * 2)After that it returns back the to the parent path,
        * 3)Later it goes with the Fibo(n-2)*/
        return Fibo(n-1) + Fibo(n-2);
    }
}