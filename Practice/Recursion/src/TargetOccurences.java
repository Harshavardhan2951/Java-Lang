import java.util.ArrayList;

public class TargetOccurences {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 4, 8, 9};
        int target = 4;
        Target(Array, target);
    }

    static void Target(int[] Arr, int target) {
        helper(Arr, target, 0);
        System.out.println(list);
    }

    static void helper(int[] Array, int target, int index) {
        if(index == Array.length) {
            return;
        }
        if(Array[index] == target) {
            list.add(index);
        }
        helper(Array, target, index + 1);
    }

}
