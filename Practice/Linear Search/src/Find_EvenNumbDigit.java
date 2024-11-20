/*https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/*/
class Find_EvenNumbDigit {
    public static void main(String[] args) {
        int[] Numb = {23, 25, 266, 27789, 1233, 123456};
        int result = findNumbers(Numb);
        System.out.println(result);
    }

    static int findNumbers(int[] Numb) {
        int count = 0;
        for(int num : Numb) {
            if(contains(num)) {
                count++;
            }
        }return count;
    }

    static boolean contains(int num) {
        int numofdigits = digits(num);
        return numofdigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num/=10;
        }
        return count;
    }
}