package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/15
 * @description https://leetcode-cn.com/problems/count-number-of-maximum-bitwise-or-subsets/
 */
public class CountMaxOrSubsets {
    int[] nums;
    int orMax;
    int cnt;

    public static void main(String[] args) {
        int[] nums = {3, 1};
        System.out.println(new CountMaxOrSubsets().countMaxOrSubsets(nums));
    }

    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        orMax = 0;
        cnt = 0;
        dfs(0, 0);
        return cnt;
    }

    private void dfs(int pos, int orSum) {
        if (pos == nums.length) {
            if (orSum == orMax) {
                cnt++;

            } else if (orSum > orMax) {
                orMax = orSum;
                cnt = 1;
            }

            return;
        }

        dfs(pos + 1, orSum | nums[pos]);
        dfs(pos + 1, orSum);
    }
}
