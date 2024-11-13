class Fibonnaci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, result;

        while (num2 < 21) {
            if (num1 < num2) {
                System.out.println(num1 + " ");
                result = num1 + num2;
                num1 = num2;
                num2 = result;
            }
        }
    }
}