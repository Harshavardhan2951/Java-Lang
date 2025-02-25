public class findTarget {
    public static void main(String[] args) {
        int[] Numbers = {1, 2, 7, 18, 3, 5, 8, 9};
        int target = 18;
        System.out.println(Target(Numbers, target));
    }

    static int Target(int[] Arr, int target) {
        return helper(Arr, target, 0);
    }

    static int helper(int[] Numb, int target, int index) {
        if(Numb[index] == target) {
            return index;
        }
        return helper(Numb, target, index + 1);
    }

}
