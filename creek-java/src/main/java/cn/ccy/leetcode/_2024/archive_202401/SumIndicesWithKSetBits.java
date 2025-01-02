package cn.ccy.leetcode._2024.archive_202401;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/25 0025 00:54:39
 * @description https://leetcode.cn/problems/sum-of-values-at-indices-with-k-set-bits/?envType=daily-question&envId=2024-01-25
 */
public class SumIndicesWithKSetBits {
    public static void main(String[] args) {

    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (bitCount(i) == k) {
                ans += nums.get(i);
            }
        }
        return ans;
    }

    public int bitCount(int x) {
        int cnt = 0;
        while (x != 0) {
            cnt += (x % 2);
            x /= 2;
        }
        return cnt;
    }
}
