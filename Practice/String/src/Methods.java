import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "      Monkey D Luffy";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.split("y")));
    }
}
