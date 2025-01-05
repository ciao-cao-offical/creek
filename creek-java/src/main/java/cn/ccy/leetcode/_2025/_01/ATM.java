package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/5 18:35:27
 * @description https://leetcode.cn/problems/design-an-atm-machine/?envType=daily-question&envId=2025-01-05
 */
public class ATM {
    public static void main(String[] args) {

    }

    private long[] cnt;   // 每张钞票剩余数量
    private long[] value; // 每张钞票面额

    public ATM() {
        cnt = new long[]{0, 0, 0, 0, 0};
        value = new long[]{20, 50, 100, 200, 500};
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; ++i) {
            cnt[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] res = new int[5];
        // 模拟尝试取出钞票的过程
        for (int i = 4; i >= 0; --i) {
            res[i] = (int) Math.min(cnt[i], amount / value[i]);
            amount -= res[i] * value[i];
        }
        if (amount > 0) {
            // 无法完成该操作
            return new int[]{-1};
        } else {
            // 可以完成该操作
            for (int i = 0; i < 5; ++i) {
                cnt[i] -= res[i];
            }
            return res;
        }
    }
}
