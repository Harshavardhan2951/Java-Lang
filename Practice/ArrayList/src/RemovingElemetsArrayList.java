import java.util.ArrayList;

public class RemovingElemetsArrayList {
    public static void main(String[] args) {
        /*How to remove elements from the ArrayList*/
        ArrayList<Integer> Numb = new ArrayList<>();
        Numb.add(1);
        Numb.add(2);
        Numb.add(3);
        Numb.add(4);
        Numb.add(5);

        for (int i = 0; i < Numb.size(); i++) {
            System.out.println(i);
        }

        int rm1 = Numb.removeFirst();
        int rm2 = Numb.remove(2 );

        System.out.println(rm1 + ", " + rm2);

        int[] arr = {11, 22, 33, 33};
        Sizesssof(arr);
        System.out.println(Sizesssof(arr));
    }

    static boolean Sizesssof(int[] arr) {
        for(int x : arr) {
            System.out.println(x);
        }
        return false;
    }
}
