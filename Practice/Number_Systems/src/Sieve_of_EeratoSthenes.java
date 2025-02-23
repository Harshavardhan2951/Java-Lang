import java.util.Arrays;

class Sieve_of_EeratoSthenes {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 2000;
        boolean[] b = new boolean[n + 1];
        SOE(n, b);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\n" + totalTime + "ms.");
    }

    static void SOE(int n, boolean[] bools) {
        for (int i = 2; i <= n; i++) {
            //Since boolean type is by default is false because no value is been added
            if(!bools[i]) {
                /*j is the multiple of
                    $. for example:
                        2*2 = 4;
                        2*3 = 6 and so on, it goes to the end till it limit of the Square root of n
                 */
                for (int j = 2*i; j <= n; j+=i) {
                    bools[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!bools[i]) {
                System.out.print(i + " ");
            }
        }
    }
}