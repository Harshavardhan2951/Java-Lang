public class Max_Element {
    public static void main(String[] args) {
        int[] Numb = {1, 2, 23, 5, 9, 45, 79};
        System.out.println("The Maximum Element in the Array is: " + MaxElement(Numb));
    }

    static int MaxElement(int[] arr) {
        int element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(element < arr[i]) {
                element = arr[i];
            }
        }
        return element;
    }
}
