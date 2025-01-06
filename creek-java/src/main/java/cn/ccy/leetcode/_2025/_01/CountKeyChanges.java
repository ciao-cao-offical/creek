package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/7 00:41:44
 * @description https://leetcode.cn/problems/number-of-changing-keys/?envType=daily-question&envId=2025-01-07
 */
public class CountKeyChanges {
    public static void main(String[] args) {

    }

    public int countKeyChanges(String s) {
        int diff = 0;
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length && i + 1 < ca.length; i++) {
            if (ca[i] == ca[i + 1] || Math.abs(ca[i] - ca[i + 1]) == 32) {
                continue;
            }
            diff++;
        }
        return diff;
    }
}
