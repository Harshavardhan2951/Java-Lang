public class nth_Magic_Number{
    public static void main(String[] args) {
        n_magic_Number(6);
    }

    static void n_magic_Number(int n) {
        int base = 5, ans = 0;
        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
