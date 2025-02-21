import java.util.Arrays;

/*https://leetcode.com/problems/flipping-an-image/*/
public class Flipping_Image_832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] rows : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = rows[i] ^ 1;
                rows[i] = rows[image.length - i - 1] ^ 1;
                rows[image.length - i - 1] = temp;
            }
        }
        return image;
    }
}
