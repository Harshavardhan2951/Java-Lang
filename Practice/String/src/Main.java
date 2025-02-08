public class Main {
    public static void main(String[] args) {
        String a = "Harsha";
        String b = a;
        System.out.println(a);
        a = "Vardhan";

        System.out.println(a);
        System.out.println(b);

        /*
        * Note:
        * -Here a is declared and initialized Harsha, this stores in the heap memory of the String pool memory region as newly added object.]
        * -Again a is initialized with a new value Vardhan, this value also stores in the Heap memory of the String pool memory region as new object
        * -if the previously or the initialy decalred and initialized variable a is not been referred by another variable then the previosly initialized
        *       variable will go to the garbage collector.
        * -As per the code since the initially decalred varibale a is been assigned to the varibale b, now varible b is the refrence variable of the a,
        *       therefore the initially decalred variale a will not go the garbage collector
        */
    }
}
