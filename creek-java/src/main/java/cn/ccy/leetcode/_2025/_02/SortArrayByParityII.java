package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/4 11:24
 * @description/link https://leetcode.cn/problems/sort-array-by-parity-ii/?envType=daily-question&envId=2025-02-04
 */
public class SortArrayByParityII {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
        }
        i = 1;
        for (int x : nums) {
            if (x % 2 == 1) {
                ans[i] = x;
                i += 2;
            }
        }
        return ans;
    }
}
