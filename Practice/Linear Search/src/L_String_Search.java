import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;

public class L_String_Search {
    public static void main(String[] args) {
        String[] Name = {"a", "b", "c"};
        ArrayList<String> Names = new ArrayList<>(Arrays.asList("a", "b", "c"));
        String target = "c";

        System.out.println(Names.indexOf(target));// ArrayList to find the index of the String
        String result = String.valueOf(ArrofName(Name, target));
        System.out.println(result);
    }
    /*Method for the finding indexof Array of String*/
    static boolean ArrofName(String[] Name, String target) {
        for (int i = 0; i < Name.length; i++) {
            if(target.equals(Name[i])) {
                return true;
            }else {
                System.out.println("The target " + target + " was not found in the Array....");
            }
        }
        return false;
    }
}
