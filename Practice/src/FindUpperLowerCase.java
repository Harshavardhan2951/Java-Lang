import java.util.Scanner;

public class FindUpperLowerCase {
    public static void main(String[] args) {
        /*Write a Program to find the Alphabet is Lower or Upper Case*/
        //Approach 1:-
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Yes it is a Lower Case Character");
        }
        else {
            System.out.println("Yes it is a Upper Case Character");
        }

    }
}
