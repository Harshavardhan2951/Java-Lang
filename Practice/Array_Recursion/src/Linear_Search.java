
import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] Numbers = {2, 1, 15, 6, 7, 6};
        System.out.println(LinearSearch(Numbers, 0, 155));
        ArrayLinearSearch(Numbers, 0, 6);
        System.out.println(list);
    }

    static int LinearSearch(int[] Numb, int n, int target) {
        if(n == Numb.length) {
            return -1;
        }
        if(Numb[n] == target) {
            return n;
        }
        else {
            return LinearSearch(Numb, n+1, target);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void ArrayLinearSearch(int[] Numb, int n, int target) {
        if(n == Numb.length) {
            return;
        }
        if(Numb[n] == target) {
            list.add(n);
        }
        ArrayLinearSearch(Numb, n+1, target);
    }
}
