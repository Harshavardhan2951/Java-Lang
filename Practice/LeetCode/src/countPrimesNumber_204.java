package src;

public class countPrimesNumber_204 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        if( n <= 2) {
            return 0;
        }
        int count = 0;
        boolean[] bool = new boolean[n + 1];
        for (int i = 2; i * i<= n; i++) {
            for (int j = i * 2; j <= n; j+=i) {
                if(!bool[i]) {
                    bool[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!bool[i]) {
                count++;
            }
        }
        return count;
    }
}
