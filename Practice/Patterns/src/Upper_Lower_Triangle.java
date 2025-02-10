/*
*         *
 ***
 *****
 *******
 *****
 ***
 *
* */
public class Upper_Lower_Triangle {
    public static void main(String[] args) {
        int n = 5;
        printULTri(n);
    }

    static void printULTri(int n) {
        //9 rows
        for (int i = 0; i < 2*n; i++) {
            int totalCols = i > n ?2* n-i : i;
            int spaces = n - totalCols;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCols; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
