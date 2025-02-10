public class FourxFour {
    public static void main(String[] args) {
        /*Print the Pattern with 4x4 $*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
