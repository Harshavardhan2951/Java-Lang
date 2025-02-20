public class Find_ith_Bit {
    public static void main(String[] args) {
        int n = 10110110;
        int a = 5;
        System.out.println(findnthBit(n, a));
    }

    static int findnthBit(int n, int a) {
        return n & (1 << (a-1));
    }

}
