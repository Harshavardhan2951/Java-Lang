/*Find the Number of digits in the base b*/
public class Number_of_digits_base {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        System.out.println((int) noofdigits(10, 2));
    }

    static double noofdigits(int n, int base) {
        return (Math.log(n) / Math.log(base)) + 1;
    }
}
