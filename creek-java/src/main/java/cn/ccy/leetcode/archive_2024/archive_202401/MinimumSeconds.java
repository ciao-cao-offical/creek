package cn.ccy.leetcode.archive_2024.archive_202401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/30 0030 00:26:48
 * @description https://leetcode.cn/problems/minimum-seconds-to-equalize-a-circular-array/?envType=daily-question&envId=2024-01-30
 */
public class MinimumSeconds {
    public static void main(String[] args) {

    }

    public int minimumSeconds(List<Integer> nums) {
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        int n = nums.size(), res = n;
        for (int i = 0; i < n; ++i) {
            mp.computeIfAbsent(nums.get(i), k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> positions : mp.values()) {
            int mx = positions.get(0) + n - positions.get(positions.size() - 1);
            for (int i = 1; i < positions.size(); ++i) {
                mx = Math.max(mx, positions.get(i) - positions.get(i - 1));
            }
            res = Math.min(res, mx / 2);
        }
        return res;
    }
}
