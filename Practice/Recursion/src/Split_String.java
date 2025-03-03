class Split_String {
    public static void main(String[] args) {
        print_split("", "baccad");
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
}