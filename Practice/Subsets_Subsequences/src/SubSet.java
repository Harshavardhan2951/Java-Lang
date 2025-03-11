import java.util.ArrayList;

//Subsets are used for the Array
public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Iteration(arr));
    }

    private static ArrayList<ArrayList<Integer>> Iteration(int[] Numb) {
        ArrayList<ArrayList<Integer>> outerSpace = new ArrayList<>();
        outerSpace.add(new ArrayList<>());
        for(int x : Numb) {
            int size = outerSpace.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> list = new ArrayList<>(outerSpace.get(i));
                list.add(x);
                outerSpace.add(list);
            }
        }
        return outerSpace;
    }

}
