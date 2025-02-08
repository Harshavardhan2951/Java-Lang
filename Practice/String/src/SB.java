public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 26; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder);
        System.out.println(builder.indexOf("e"));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
