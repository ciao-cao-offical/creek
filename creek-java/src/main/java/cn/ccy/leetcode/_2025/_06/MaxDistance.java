package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-manhattan-distance-after-k-changes/?envType=daily-question&envId=2025-06-20">3443. K 次修改后的最大曼哈顿距离</a>
 * @since 2025/6/20 23:00
 */
public class MaxDistance {
    public static void main(String[] args) {

    }

    public int maxDistance(String s, int k) {
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;
        for (char it : s.toCharArray()) {
            switch (it) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    west++;
                    break;
            }
            int times1 = Math.min(Math.min(north, south), k); // modification times for N and S
            int times2 = Math.min(Math.min(east, west), k - times1); // modification times for E and W
            ans = Math.max(ans, count(north, south, times1) + count(east, west, times2));
        }
        return ans;
    }

    private int count(int drt1, int drt2, int times) {
        return Math.abs(drt1 - drt2) + times * 2; // Calculate modified Manhattan distance
    }
}
