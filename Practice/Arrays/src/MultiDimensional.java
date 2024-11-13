import java.util.Arrays;

class MultiDimensional {
    public static void main(String[] args) {
        int[][] table = {
                {1, 2, 3},
                {2, 3, 4},
                {4, 5, 6}
        };

        for(int[] i : table) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println();

        for(int row=0; row<table.length; row++) {
            for(int column=0; column<table[row].length; column++) {
                System.out.print(table[row][column] + ", ");
            }
            System.out.println();
        }
    }
}