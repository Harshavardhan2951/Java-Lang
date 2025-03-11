import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        String name = "abc";
        SubSeq_Approach("", name);
        System.out.println(subSequence("", name));
    }

    static void SubSeq_Approach(String left, String right) {
        //Base Condition
        if(right.isEmpty()) {
            System.out.println("[" + left + "]");
            return;
        }
        //Logic
        char ch = right.charAt(0);
        SubSeq_Approach(left + ch, right.substring(1));
        SubSeq_Approach(left, right.substring(1));
    }

    static ArrayList<String> subSequence(String p, String up) {
        //Base Condition
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //Logic
        char ch = up.charAt(0);
        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        ArrayList<String> right = subSequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
