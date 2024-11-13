import java.util.ArrayList;

public class ArrayListTryEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 1; i <= 2; i++) {
            System.out.println(list.get(i));
        }
    }
}
