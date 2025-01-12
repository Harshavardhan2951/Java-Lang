/*https://leetcode.com/problems/peak-index-in-a-mountain-array/description/*/
public class Peak_Mountain_Index {
    public static void main(String[] args) {
        int[] arr ={0, 0, 1, 2, 3, 6, 0, 2, 1};
        int result = LinearSearch(arr);
        System.out.println("Therefore the Peak of the Index of the Array found in Index: " + result + ", and it's value: " + arr[result]);
    }

    static int LinearSearch(int[] arr) {
        int start = 0, last = arr.length - 1;
        while(start <= last) {
            int response = start + 1;
            if(arr[start] <= arr[response]) {
                start += 1;
            }else {
                return start;
            }
        }return -1;
    }
}
