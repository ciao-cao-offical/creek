package cn.ccy.leetcode.archive_2023.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/21 0021 00:49:42
 * @description https://leetcode.cn/problems/minimum-deletions-to-make-array-beautiful/?envType=daily-question&envId=2023-11-21
 * ☆☆☆ 2023b2t
 */
public class MinDeletion {
    public static void main(String[] args) {

    }

    public int minDeletion(int[] nums) {
        int n = nums.length;
        int ans = 0;
        boolean check = true;
        for (int i = 0; i + 1 < n; ++i) {
            if (nums[i] == nums[i + 1] && check) {
                ++ans;
            } else {
                check = !check;
            }
        }
        if ((n - ans) % 2 != 0) {
            ++ans;
        }
        return ans;
    }
}
