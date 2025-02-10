public class FivexLOne {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println(pattern1(n));
    }

    public static int pattern1(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("$ ");
            }
            System.out.println();

        }return -1;
    }
}
