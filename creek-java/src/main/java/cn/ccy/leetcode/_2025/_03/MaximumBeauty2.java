package cn.ccy.leetcode._2025._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/most-beautiful-item-for-each-query/?envType=daily-question&envId=2025-03-09">2070. 每一个查询的最大美丽值</a>
 * @since 2025/3/9 22:34
 */
public class MaximumBeauty2 {
    public static void main(String[] args) {

    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        // 将物品按价格升序排序
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        int n = items.length;
        // 按定义修改美丽值
        for (int i = 1; i < n; ++i) {
            items[i][1] = Math.max(items[i][1], items[i - 1][1]);
        }
        // 二分查找处理查询
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = query(items, queries[i]);
        }
        return res;
    }

    private int query(int[][] items, int q) {
        int l = 0, r = items.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (items[mid][0] > q) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (l == 0) {
            // 此时所有物品价格均大于查询价格
            return 0;
        } else {
            // 返回小于等于查询价格的物品的最大美丽值
            return items[l - 1][1];
        }
    }
}
