package cn.ccy.leetcode.archive_2022.archive_202207;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2022/7/18
 * @description https://leetcode.cn/problems/array-nesting/
 * ★★★ 【图】,试试【原地标记】
 */
public class ArrayNesting {
    public static void main(String[] args) {

    }

    public int arrayNesting(int[] nums) {
        int ans = 0, n = nums.length;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            while (!vis[i]) {
                vis[i] = true;
                i = nums[i];
                ++cnt;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
