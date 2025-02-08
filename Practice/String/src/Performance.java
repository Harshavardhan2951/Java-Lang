public class Performance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
