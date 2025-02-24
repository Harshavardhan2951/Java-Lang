public class Product_of_Digit {
    public static void main(String[] args) {
        int n = 4345;
        System.out.println(ProductRecursion(n));
    }

    static int ProductRecursion(int n) {
        if(n % 10 == n) {
            return n;
        }
        return ProductRecursion(n / 10) * (n % 10);
    }
}
