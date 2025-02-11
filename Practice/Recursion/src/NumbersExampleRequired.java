public class NumbersExampleRequired {
    public static void main(String[] args) {
        //Write a Function that takes in a number and prints it.
        //Print first 5 numbers: 1 2 3 4 5
        Print(1);
    }
    //Consider a Scenario where if there are 1m+ of same logic wihtin the funtioon it is not a proper mentod to wite so many functions instead calling the finctioon with in the same functoin.
    static void Print(int n) {
        if(n>5) {
            return;
        }
        System.out.println(n);
        Print(n + 1);
    }

}
