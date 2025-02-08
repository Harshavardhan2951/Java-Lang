import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";

        System.out.println(Palindromes(name));
    }

    static boolean Palindromes(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0, end = str.length() - 1;
        while(start <= end/2) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
