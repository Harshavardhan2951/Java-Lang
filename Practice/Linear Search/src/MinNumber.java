public class MinNumber {
    public static void main(String[] args) {
        int[] Numb = {1, -11, 92, 4, 45};
        int result = MinNumb(Numb);
        int result1 = maxNumb(Numb);
        System.out.println(result);
        System.out.println(result1);
    }

    static int MinNumb(int[] Numb) {
        int received = 0;
        for (int i = 0; i < Numb.length; i++) {
            if(Numb[i] < received) {
                received = Numb[i];
            }
        }
        System.out.println(received);
        return -1;
    }

    static int maxNumb(int[] Numb) {
        int received = 0;
        for (int i = 0; i < Numb.length; i++) {
            if(Numb[i] > received) {
                received = Numb[i];
            }
        }
        System.out.println(received);
        return -1;
    }
}
