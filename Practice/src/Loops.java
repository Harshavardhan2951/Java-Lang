class Loops {
    public static void main(String[] args) {
        int count = 1, sum=0, mul = 1, result=1, Numb = 10;
//        while(count + 6 < 10) {
//            count += 5;
//            count++;
//            System.out.println(count);

            //Print Fist n even numbers using while loop
//        while(count != 100) {
//            if(count%2 == 0) {
//                System.out.println(count);
//            }
//            count++;
//            sum += count;
//        }
//
//        System.out.println("Therefore the Sum of the N even Numbers is: " + sum);

        /*Multiplication Table of a some Number using while loop*/
//        while(mul < 11) {
//            result = mul * 10;
//            System.out.println("10 * " + mul  + ": " + result);
//            mul++;
//        }

        /*Multiplication of Table  in Reverse Order*/
        while(Numb >= 0) {
            result = Numb * 10;
            System.out.println("10 * " + Numb + ": " + result);
            Numb--;
        }
    }

}