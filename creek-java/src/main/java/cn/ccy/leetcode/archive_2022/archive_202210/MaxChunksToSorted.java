package cn.ccy.leetcode.archive_2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/13
 * @description https://leetcode.cn/problems/max-chunks-to-make-sorted/
 * ⭐️⭐️⭐️ cvd
 */
public class MaxChunksToSorted {
    public static void main(String[] args) {

    }

    //简单模拟 from：https://leetcode.cn/problems/max-chunks-to-make-sorted/solution/by-ac_oier-4uny/
    //工作好累啊，不想工作...刷题摆烂了...
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length, ans = 0;
        for (int i = 0, j = 0, min = n, max = -1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            if (j == min && i == max) {
                ans++;
                j = i + 1;
                min = n;
                max = -1;
            }
        }
        return ans;
    }
}
