package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-make-array-elements-zero/?envType=daily-question&envId=2025-09-06">3495. 使数组元素都变为零的最少操作次数</a>
 * @since 2025/9/6 21:21
 * ★★★★★ 2025cvd
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    private long get(int num) {
        long cnt = 0;
        int i = 1;
        int base = 1;
        while (base <= num) {
            int end = Math.min(base * 2 - 1, num);
            cnt += (long) ((i + 1) / 2) * (end - base + 1);
            i++;
            base *= 2;
        }
        return cnt;
    }

    public long minOperations(int[][] queries) {
        long res = 0;
        for (int[] q : queries) {
            long count1 = get(q[1]);
            long count2 = get(q[0] - 1);
            res += (count1 - count2 + 1) / 2;
        }
        return res;
    }
}
