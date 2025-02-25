import java.util.ArrayList;

public class ArrListwo_Argument_Call {

    public static void main(String[] args) {
        int[] arrray = {1,2,7,7,3,5,8,9};
        int target = 7;
        System.out.println(helper(arrray, target));

    }

    static ArrayList<Integer> helper(int[] Array, int target) {
        return FindOccurenct(Array, target, 0);
    }

    static ArrayList<Integer> FindOccurenct(int[] Arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == Arr.length) {
            return list;
        }
        if(Arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = FindOccurenct(Arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}
