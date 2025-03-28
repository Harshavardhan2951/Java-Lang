class Find_ith_Bit {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 2, 5, 3};
        int[] arr1 = {2, 3, 2, 2, 7, 7, 8, 7, 8, 8};
        int[] Numb = {0, 0, 1, 1, 0, 1, 1, 0};
        System.out.println(notRepeated(arr));
        System.out.println(returnIndex(Numb, 5));
        System.out.println(setIndex(Numb, 5));
        System.out.println(resetBit(Numb));
        System.out.println(Magical_Number(6));
        System.out.println(count_bitsLength(34567, 10));
        System.out.println(power_of_2_or_not(129));
        System.out.println(power_of_numb(2, 5));
    }

    static int notRepeated(int[] array) {
        int ans = 0;
        for(int x : array) {
            ans^= x;
        }
        return ans;
    }

    static int returnIndex(int[] Numb, int target) {
        for (int i = 0; i< Numb.length-1; i++) {
            if((Numb[i] & (1<<(target-1))) != 0) {
                return i;
            }
        }
        return -1;
    }

    static int setIndex(int[] Numb, int target) {
        for (int i = 0; i< Numb.length-1; i++) {
            if((Numb[i] | (1<<(target-1))) != 0) {
                return i | 1;
            }
        }
        return -1;
    }

    static int resetBit(int[] Numb) {
        for(int i=0; i< Numb.length; i++) {
            if( (Numb[i] & 1) == 1) {
                return i;
            }
        }return 0;
    }
//
//    static int non_RepeatedNumb(int[] Numb) {
//       int count = 0, ans = 0;
//        for (int i = 0; i < Numb.length; i++) {
//            for (int j = 1; j < Numb.length; j++) {
//                if(Numb[i] == Numb[j]) {
//                    count++;
//                }
//                if(count == 3) {
//                    break;
//                }
//                if(Numb[i] && 3)
//            }
//        }
//       return ans;
//    }

    static int Magical_Number(int num) {
        int mul_Numb = 10;
        int ans = 0;
        while(num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans += last * mul_Numb;
            mul_Numb *= 5;
        }
        return ans;
    }

    static int count_bitsLength(int n, int base) {
        int ans = (int)(Math.ceil(Math.log(n) / Math.log(base)));
        System.out.println("Bits Length is: " + ans);
        return ans;
    }

    static int power_of_2_or_not(int n) {
        int ans = 0;
        int mul = 1;
        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * mul;
            mul *= 2;
        }
        if((ans & 1) == 0) {
            System.out.println("The given number is a Power of 2");
        }else {
            System.out.println("The given number is not a power of 2");
        }
        return ans;
    }

    static int power_of_numb(int num, int power) {
        int ans = 1;
        while(power > 0) {
            if((power & 1) == 1) {
                ans *= num;
            }
            num *= num;
            power = power >> 1;
        }
        return ans;
    }
}