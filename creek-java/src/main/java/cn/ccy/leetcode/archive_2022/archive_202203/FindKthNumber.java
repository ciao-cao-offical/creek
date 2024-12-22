package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/23 0023
 * @description https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/
 * ☆☆☆☆☆
 */
public class FindKthNumber {
    public static void main(String[] args) {
        System.out.println(new FindKthNumber().findKthNumber(13, 2));
    }

    public int findKthNumber(int n, int k) {
        int cur = 1;
        k--;
        while (k > 0) {
            int steps = getSteps(cur, n);
            if (steps <= k) {
                k -= steps;
                cur++;

            } else {
                cur *= 10;
                k--;
            }
        }

        return cur;
    }

    private int getSteps(int cur, long n) {
        int steps = 0;
        long first = cur;
        long last = cur;
        while (first <= n) {
            steps += Math.min(last, n) - first + 1;
            first *= 10;
            last = last * 10 + 9;
        }
        return steps;
    }
}
