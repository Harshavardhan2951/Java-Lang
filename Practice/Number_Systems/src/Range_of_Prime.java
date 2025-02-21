public class Range_of_Prime {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " " + Prime(i));
        }
    }

    static boolean Prime(int n) {
        if(n <= 1) {
            return false;
        }

        int c = 2;
        while(c*c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
