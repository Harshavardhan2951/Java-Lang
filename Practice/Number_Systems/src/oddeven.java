public class oddeven {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(idOddorEven(n));
        if(idOddorEven(n)) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is odd");
        }
    }

    static boolean idOddorEven(int n) {
        return (n&1) == 0;
    }
}
