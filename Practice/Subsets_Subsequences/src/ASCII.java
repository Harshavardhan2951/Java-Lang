public class ASCII {
    public static void main(String[] args) {
        String ch = "abc";
        AsciiNumber("", ch);
    }

    static void AsciiNumber(String p, String up) {
        if(up.isBlank()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        AsciiNumber((int) ch + p + ch, up.substring(1));
        AsciiNumber(p, up.substring(1));
    }
}
