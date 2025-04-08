
public class Sorted_R_Not {
    public static void main(String[] args) {
        int[] num = {1, 6, 3, 4, 5};
        System.out.println(checkSorted_R_Not(num, 0));
    }

    static boolean checkSorted_R_Not(int[] Numb, int n) {
        if(n == Numb.length - 1) {
            return true;
        }
        if(Numb[n] < Numb[n + 1] && n <= Numb.length-1) {
            return checkSorted_R_Not(Numb, ++n);
        }else {
            return false;
        }
    }
}
