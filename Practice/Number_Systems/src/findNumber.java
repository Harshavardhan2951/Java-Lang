public class findNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(number(arr));
    }

    static int number(int[] Numb){
        int ans = 0;
        for (int i = 0; i < Numb.length; i++) {
            ans = ((ans ^ Numb[i]));
        }return ans;
    }
}
