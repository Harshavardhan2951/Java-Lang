import java.util.Arrays;

public class RowWiseSum {
    public static void main(String[] args) {
        //Example: For input [[1, 2], [3, 4]], the output should be [3, 7] (since row sums are 1 + 2 = 3 and 3 + 4 = 7).
        int[][] numb = {{1, 2}, //0th row
                        {3, 4}}; //1st row

        returnsArray(numb);
        returnsSumofEachRow(numb);
    }

    static void returnsArray(int[][] Numb) {
        for(int[] extractRows : Numb) {
            System.out.println(Arrays.toString(extractRows));
        }
    }

    static void returnsSumofEachRow(int[][] Numb) {
        int count1 = Numb[0][0] + Numb[0][1];
        int count2 = Numb[1][0] + Numb[1][1];
        for(int[] row : Numb) {
            for(int column=0; column < row.length; column++) {
            }
        }System.out.println("The Sum of the Each Row is: " + count1 + ", " + count2);
    }
}
