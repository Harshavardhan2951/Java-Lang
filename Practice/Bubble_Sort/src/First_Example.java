import java.util.Arrays;

public class First_Example {
    public static void main(String[] args) {
        int[] Numb = {3, 4, 1, 5, 2};

        for (int i = 0; i < Numb.length - 1; i++) {
            for (int j = 1; j < Numb.length - i; j++) {
                if(Numb[j] < Numb[j-1]) {
                    int temp = Numb[j];
                    Numb[j] = Numb[j-1];
                    Numb[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(Numb));
    }
}

