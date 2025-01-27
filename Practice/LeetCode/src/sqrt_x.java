public class sqrt_x {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        System.out.println(sqrt(arr, target));
        System.out.println("Binary Search: " + findIntSqrt(arr, target));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Run Time Complexity: " + totalTime + "ms");
    }

    //Applied O(N) time complexity
    static int sqrt(int[] Numb, int target) {
        for(int x : Numb) {
            if(x * x == x) {
                return x;
            } else if ((x*x != target) && (target / x <= target) && (x*x > target)) {
                return x - 1;
            }
        }return -1;
    }

    //Added Binary Search O(log(n))
    static int findIntSqrt(int[] arr, int x) {
        int startIndex = 1, endIndex = arr.length - 1;
        while(startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if(midIndex > x/midIndex) {
                endIndex = midIndex - 1;
            } else if (midIndex < x/midIndex) {
                startIndex = midIndex + 1;
            }else  {
                return midIndex;
            }
        }return endIndex;
    }
}
