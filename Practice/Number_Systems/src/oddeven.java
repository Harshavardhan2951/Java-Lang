public class oddeven {
    public static void main(String[] args) {
        System.out.println(idOddorEven(54+1));
    }

    static boolean idOddorEven(int n) {
        return (n&1) == 1;
    }
}
