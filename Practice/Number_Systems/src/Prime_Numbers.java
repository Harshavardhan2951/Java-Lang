public class Prime_Numbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56, 7, 8, 9, 10, 11};
        System.out.println(PrimeNumb(arr, 11));
    }

    static String PrimeNumb(int[] arr, int n) {
        for(int i = 2; i < arr.length - 1; i++) {
            if(n % i == 0 && i < n) {
                return n + " is not a Prime Number";
            }
        }

        return n + " is a Prime Number";
    }
}
