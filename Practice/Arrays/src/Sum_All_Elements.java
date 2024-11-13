import java.util.Arrays;

public class Sum_All_Elements {
    public static void main(String[] args) {
        //Example: For input [[1, 2], [3, 4]], the output should be 10 (since 1 + 2 + 3 + 4 = 10).
        int[][] numb = {{1, 2}, //0th row
                        {3, 4}}; //1st row
        returnData(numb);
        sumData(numb);
    }

    static void returnData(int[][] Numb) {
        int count = Numb.length;
        System.out.println("The Available Rows are: " + count);
       for(int[] extractNumb : Numb ) {
           System.out.println(Arrays.toString(extractNumb));
       }
    }

    static void sumData(int[][] Numbs) {
        int sum1 = Numbs[0][0] + Numbs[0][1] + Numbs[1][0] + Numbs[1][1];
        for (int row=0; row<Numbs.length; row++) {
            for (int j = 0; j < Numbs[row].length; j++) {
                //Reasonable Blank here
            }
        }System.out.println("The Sum of the Numbs[2x2] is: " + sum1);
    }
}
