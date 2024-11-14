import java.util.ArrayList;

public class ArrayList_Collection_Concat {
    public static void main(String[] args) {
        ArrayList<Integer> first3 = new ArrayList<>();
        first3.add(1);
        first3.add(2);
        first3.add(3);

        ArrayList<Integer> New = new ArrayList<>(first3);

        ArrayList<Integer> next3 = new ArrayList<>();
        next3.add(4);
        next3.add(5);
        next3.add(6);

        New.addAll(next3);
        System.out.println(New);
    }
}
