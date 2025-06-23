package cn.ccy.leetcode._2025._06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-all-k-distant-indices-in-an-array/?envType=daily-question&envId=2025-06-24">2200. 找出数组中的所有 K 近邻下标</a>
 * @since 2025/6/24 00:21
 */
public class FindKDistantIndices {
    public static void main(String[] args) {

    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        // 遍历数对
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    res.add(i);
                    break; // 提前结束以防止重复添加
                }
            }
        }
        return res;
    }
}
