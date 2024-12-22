package cn.ccy.leetcode.archive_2022.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/18 0018
 * @description https://leetcode.cn/problems/kth-smallest-number-in-multiplication-table/
 * ☆☆☆☆
 */
public class FindKthNumber {
    public static void main(String[] args) {
        int m = 3, n = 3, k = 5;
        System.out.println(new FindKthNumber().findKthNumber(m, n, k));
    }

    //二分查找
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int x = left + (right - left) / 2;
            int count = x / n * n;

            for (int i = x / n + 1; i <= m; i++) {
                count += x / i;
            }

            if (count >= k) {
                right = x;

            } else {
                left = x + 1;
            }
        }

        return left;
    }
}
