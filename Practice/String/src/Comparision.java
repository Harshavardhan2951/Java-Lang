public class Comparision {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        String a3 = "Harahs";
        //Here the values are been compared from the String pool of the heap memory
        System.out.println(a == b);
        String a1 = new String("Harsha");
        String a2 = new String("Harsha");
        //This will print false because this is comparing the variable not the values of them.. and here there values are stroed in the heap memory not in the String pool
        System.out.println(a1 == a2);
        //To compare with the values
        System.out.println(a1.equals(a2));
        //To print the character within the given String
        System.out.println(a3.charAt(2));
        System.out.println(a3.chars());
    }
}
