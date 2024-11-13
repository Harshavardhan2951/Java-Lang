public class TypeCasting {
    public static void main(String[] args) {
        /*Implicit Type Casting*/
        int Numb1 = 10;
        float floatValue = Numb1;
        System.out.println("Implicit Type Casting: " + floatValue);

        /*Explicit Type Casting*/
        float floatVal = 98988.96f;
        int Numb2 = (int) (floatVal);
        System.out.println(Numb2);

        /*Automatic Type promotion in Expression*/
        byte a = 10;
        byte b = 20;
        byte c = 30;
        float d = (a * b) /  c;
        //float f = (float) (d);

        System.out.println(d);

        int numb = 'a';
        //char ch = (char)(numb);
        System.out.println(numb);

        System.out.println(.1f * 922);
    }
}