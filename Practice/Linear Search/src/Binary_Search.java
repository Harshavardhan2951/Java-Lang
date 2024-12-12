class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,48};
        int result = findIndex(arr, 36);
        System.out.println(result);
    }

    static int findIndex(int[] Numb, int target) {
        int startIndex = 0;
        int lastIndex = Numb.length - 1;

        while(startIndex <= lastIndex) {
            int midElement = startIndex + (lastIndex - startIndex) / 2;
            if(target < Numb[midElement]) {
                System.out.println("Target is available in the Left Side of the Array....");
                lastIndex = midElement - 1;
            }
            else if(target > Numb[midElement]) {
                startIndex = midElement + 1;
                System.out.println("Target is found in the Right side of the Array....");
            }
            else {
                return midElement;
            }
        }
        return -1;
    }
}