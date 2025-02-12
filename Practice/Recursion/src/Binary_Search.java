public class Binary_Search {
    public static void main(String[] args) {
        int[] Numb = {1,2,3,4,5,6,7,8};
        System.out.println(BinarySearchApproach(Numb, 99, 0, Numb.length - 1));
    }

    static int BinarySearchApproach(int[] array, int target, int start, int end) {
        if(start > end) return -1;
        int midElement = start + (end - start) / 2;
        if(array[midElement] == target) {
            return midElement;
        } if (target < array[midElement]) {
            return BinarySearchApproach(array, target, start, midElement - 1);
        }
            return BinarySearchApproach(array, target, midElement + 1, end);
    }
}
