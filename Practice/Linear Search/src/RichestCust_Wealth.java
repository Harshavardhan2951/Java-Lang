import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCust_Wealth {
    public static void main(String[] args) {
        int[][] Wealth = {
                {1, 2, 23},
                {3, 2, 50}
        };

        int result = maximumWealth(Wealth);;
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowsum = 0;
            for (int i : account) {
                rowsum += i;
            }
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
}





