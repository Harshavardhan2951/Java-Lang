import java.util.Scanner;

public class switchcond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'a':
                System.out.println("Character A");
                break;
        }
    }
}
