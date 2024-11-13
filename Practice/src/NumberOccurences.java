class NumberOccurences {
    public static void main(String[] args) {
        int n = 12341222, count = 0, rem, num = 2;
        while(n > 0) {
            rem = n % 10;
            if(rem == num) {
                count++;
            }
            n = n/10;
        }
        System.out.println("The Number of Occurences of the Number " + num + " is: " + count);
    }
}
