import java.util.ArrayList;

public class FindOccurenArrList {
    public static void main(String[] args) {
        int[] arrray = {1,2,7,7,3,5,8,9};
        System.out.println(FindOccurence(arrray, 7, new ArrayList<>(), 0));
    }

    static ArrayList<Integer> FindOccurence(int[] Array, int target, ArrayList<Integer> list, int index) {
        if(index == Array.length) {
            return list;
        }
        if(Array[index] == target) {
            list.add(index);
        }
        return FindOccurence(Array, target, list, index + 1);
    }
}
