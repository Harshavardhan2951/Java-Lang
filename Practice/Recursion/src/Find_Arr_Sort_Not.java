public class Find_Arr_Sort_Not {
    public static void main(String[] args) {
        int[] Arr = {1,2,7,3,5,8,9};
        System.out.println(Find(Arr));
    }

    static boolean Find(int[] Numb) {
        return helper(Numb, 0);
    }

    static boolean helper(int[] Numbers, int ans) {
        if(Numbers[ans] == Numbers[Numbers.length - 1]) {
            return true;
        }
        if(Numbers[ans] < Numbers[ans + 1]) {
            return helper(Numbers, ans + 1);
        }
        else {
            return false;
        }
    }
}
