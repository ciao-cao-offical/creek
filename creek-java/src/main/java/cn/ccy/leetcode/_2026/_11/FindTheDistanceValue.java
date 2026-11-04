package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-distance-value-between-two-arrays/?envType=daily-question&envId=2026-11-05">1385. 两个数组间的距离值</a>
 * @since 2026/11/5 01:13
 */
public class FindTheDistanceValue {
    public static void main(String[] args) {

    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int x : arr1) {
            boolean ok = true;
            for (int y : arr2) {
                ok &= Math.abs(x - y) > d;
            }
            cnt += ok ? 1 : 0;
        }
        return cnt;
    }
}
