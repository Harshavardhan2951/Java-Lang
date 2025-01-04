import java.util.Scanner;

class Ceiling {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Target Element: ");
        int target = input.nextInt();

        int[] Arr = {2, 3, 5, 9, 14, 16, 18};


        int result2 = Least_Largest_Element(Arr, target);
        System.out.println("The Target Element found in teh index: " + result2);

        int result1 = LinearSearch(Arr, target);
        System.out.println("The Target Element found with the Linear Search: " + result1);
    }

    static int Least_Largest_Element(int[] Numb, int target) {
        int startIndex = 0, lastIndex = Numb.length - 1;

        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target > Numb[midElement]) {
                startIndex = midElement + 1;
            } else if (target < Numb[midElement]) {
                lastIndex = midElement - 1;
            }else {
                System.out.println("The Target is Equal to the Middle Element: " + midElement);

            }
        }return startIndex;
    }

    static int LinearSearch(int[] Numb, int target) {
        for (int i=0; i<Numb.length; i++) {
            if(Numb[i] == target) {
                return i;
            }
        }return -1;
    }
}