public class Power_of_two {
    public static void main(String[] args) {
        findvalue(6);
        simplemethod(6);
    }

    static void findvalue(int n) {
        int value = 16;
        int  ans = 0, base = 1;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans = (base * last);
            base *= 2;
        }
        if(ans == value) {
            System.out.println(ans + " is a Power of 2.");
        }else {
            System.out.println(ans + " is Not a Power of 2");
        }
    }

    static void simplemethod(int n) {
        if((n & n-1) == 0) {
            System.out.println(n + " is a Power of 2");
        }else {
            System.out.println(n + " is not a Power of 2");
        }
    }
}
