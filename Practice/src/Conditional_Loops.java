import java.util.Scanner;

class Conditional_Loops {
    public static void main(String[] args) {
//        int age = 12;
//        if(age > 10) {
//            System.out.println("Good You have grown up....");
//        }else {
//            System.out.println("Still young age brat");
//        }

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Plase Enter the Number: ");
        num = sc.nextInt();

        while(num > 10) {
            System.out.println(num + ": Hello There Welcome to the Cocaine Party....");
            num--;
        }
        System.out.println("Therefore the total number of the lines is: " + num);
        
    }
}