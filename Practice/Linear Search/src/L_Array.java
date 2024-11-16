class L_Array {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4};
        int target = 5;

        int result = indexNumb(Arr, target);
        System.out.println(result);
    }

    static int indexNumb(int[] Numb, int target) {
        int index = 0;
        for (int i = 0; i < Numb.length; i++) {
            if(Numb[i] == target) {
                index = i;
                return index;
            }
        }return -1;
    }
}