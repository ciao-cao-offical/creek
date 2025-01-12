package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/12 18:05:58
 * @description https://leetcode.cn/problems/largest-combination-with-bitwise-and-greater-than-zero/?envType=daily-question&envId=2025-01-12
 */
public class LargestCombination {
    public static void main(String[] args) {

    }

    // 计算从低到高第 k 个二进制位数值为 1 的元素个数
    public int maxlen(int[] candidates, int k) {
        int res = 0;
        for (int num : candidates) {
            if ((num & (1 << k)) != 0) {
                res++;
            }
        }
        return res;
    }

    public int largestCombination(int[] candidates) {
        int res = 0;
        for (int i = 0; i < 24; i++) {
            // 遍历二进制位
            res = Math.max(res, maxlen(candidates, i));
        }
        return res;
    }
}
