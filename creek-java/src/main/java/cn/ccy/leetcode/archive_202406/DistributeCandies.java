package cn.ccy.leetcode.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/1 21:58:02
 * @description https://leetcode.cn/problems/distribute-candies-among-children-i/?envType=daily-question&envId=2024-06-01
 */
public class DistributeCandies {
    public static void main(String[] args) {
        System.out.println(new DistributeCandies().distributeCandies(5, 2));
    }

    public int distributeCandies(int n, int limit) {
        int res = 0;
        for (int i = 0; i <= Math.min(n, limit); i++) {
            for (int j = 0; j <= n - i && j <= limit; j++) {
                int k = n - i - j;
                if (k >= 0 && k <= limit) {
                    ++res;
                }
            }
        }

        return res;
    }
}
