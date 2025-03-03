class Split_String {
    public static void main(String[] args) {
        print_split("", "baccad");
        System.out.println(print_split_String("", "baccad"));
        System.out.println(skip("baccadah"));
    }

    static void print_split(String positioned, String un_positioned) {
        if(un_positioned.isBlank()) {
            System.out.println(positioned);
            return;
        }
        char ch = un_positioned.charAt(0);
        if(ch == 'a') {
            print_split(positioned, un_positioned.substring(1));
        }else {
            print_split(positioned + ch, un_positioned.substring(1));
        }
    }

    static String print_split_String(String positioned, String un_positioned) {
        if(un_positioned.isBlank()) {
            return positioned;
        }
        char ch = un_positioned.charAt(0);
        if(ch == 'a') {
            return print_split_String(positioned, un_positioned.substring(1));
        }else {
            return print_split_String(positioned + ch, un_positioned.substring(1));
        }
    }

    static String skip(String unpositioned) {
        if(unpositioned.isEmpty()) {
            return "";
        }

        char ch = unpositioned.charAt(0);
        if(ch == 'a') {
            return skip(unpositioned.substring(1));
        }else {
            return ch + skip(unpositioned.substring(1));
        }
    }
}