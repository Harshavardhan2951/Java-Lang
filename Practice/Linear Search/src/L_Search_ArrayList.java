import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L_Search_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Numb = new ArrayList<>(Arrays.asList(14, 47, 49, 44));
//        Numb.add(14);
//        Numb.add(47);
//        Numb.add(49);
//        Numb.add(44);
        System.out.print("Enter the Target Number: ");
        int target = sc.nextInt();

        for(int x : Numb) {
            System.out.println("The available Numbers are: " + x);
        }
        if(Numb.contains(target)) {
            System.out.println("The Target Number " + target + " is available at index: " + Numb.indexOf(target));
        }else {
            System.out.println("Nope Not Available...");
        }
    }
}
