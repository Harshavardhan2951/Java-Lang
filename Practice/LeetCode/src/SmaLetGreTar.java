import java.util.Scanner;

/*744. Find Smallest Letter Greater Than Target*/
public class SmaLetGreTar {
    static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {
        System.out.print("Enter the Target Element: ");
        char target = input.next().charAt(0);
        char[] Arr = {'e', 'f', 'g', 'h', 'i', 'j'};

        int result = Small_Letter_Greater_Target(Arr, target);
        System.out.println(result);
    }

    static char Small_Letter_Greater_Target(char[] letters, char target) {
        int startIndex = 0, lastIndex = letters.length - 1, N = letters.length;
        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target < letters[midElement]) {
                lastIndex = midElement - 1;

            }else {
                startIndex = midElement + 1;
            }
        }return letters[startIndex % N];
    }
}
