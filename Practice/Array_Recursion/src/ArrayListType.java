import java.util.ArrayList;

public class ArrayListType {
    public static void main(String[] args) {
        int[] Numbers = {2, 1, 15, 6, 7, 6};
        System.out.println(Returnlist(Numbers, 0, 6, new ArrayList<>()));
        System.out.println(Returnlistlocally(Numbers, 0, 6));
    }

    static ArrayList<Integer> Returnlist(int[] Numb, int n, int target, ArrayList<Integer> list) {
        if(n == Numb.length) {
            return list;
        }
        if(Numb[n] == target) {
            list.add(n);
        }
        return Returnlist(Numb, n+1, target, list);
    }

    static ArrayList<Integer> Returnlistlocally(int[] Numb, int n, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n == Numb.length) {
            return list;
        }
        if(Numb[n] == target) {
            list.add(n);
        }
        ArrayList<Integer> saveshereTogether =  Returnlistlocally(Numb, n+1, target);
        list.addAll(saveshereTogether);
        return list;
    }
}
