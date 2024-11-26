package cn.ccy.leetcode.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/27 00:36:43
 * @description https://leetcode.cn/problems/alternating-groups-ii/?envType=daily-question&envId=2024-11-27
 */
public class NumberOfAlternatingGroups2 {
    public static void main(String[] args) {

    }

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int res = 0, cnt = 1;
        for (int i = -k + 2; i < n; i++) {
            if (colors[(i + n) % n] != colors[(i - 1 + n) % n]) {
                cnt += 1;
            } else {
                cnt = 1;
            }
            if (cnt >= k) {
                res += 1;
            }
        }
        return res;
    }
}
