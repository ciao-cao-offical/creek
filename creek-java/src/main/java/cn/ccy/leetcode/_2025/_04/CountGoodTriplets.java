package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-good-triplets/?envType=daily-question&envId=2025-04-14">1534. 统计好三元组</a>
 * @since 2025/4/14 23:38
 */
public class CountGoodTriplets {
    public static void main(String[] args) {

    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, cnt = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        ++cnt;
                    }
                }
            }
        }
        return cnt;
    }
}
