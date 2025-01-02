package cn.ccy.leetcode._2023.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/22 0022 00:55:33
 * @description https://leetcode.cn/problems/minimum-deletions-to-make-array-beautiful/?envType=daily-question&envId=2023-11-22
 * ☆☆☆ 2023b2t
 */
public class MinDeletion2 {
    public static void main(String[] args) {

    }

    // from 三叶姐 https://leetcode.cn/problems/minimum-deletions-to-make-array-beautiful/solutions/2535327/gong-shui-san-xie-zhi-ji-ben-zhi-de-ji-j-dk05/?envType=daily-question&envId=2023-11-22
    public int minDeletion(int[] nums) {
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            if ((i - cnt) % 2 == 0 && i + 1 < n && nums[i] == nums[i + 1]) cnt++;
        }
        return (n - cnt) % 2 != 0 ? cnt + 1 : cnt;
    }
}
