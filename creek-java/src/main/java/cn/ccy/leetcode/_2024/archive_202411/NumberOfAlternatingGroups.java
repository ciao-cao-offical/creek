package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/26 00:22:13
 * @description https://leetcode.cn/problems/alternating-groups-i/?envType=daily-question&envId=2024-11-26
 */
public class NumberOfAlternatingGroups {
    public static void main(String[] args) {

    }

    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i - 1 + n) % n] && colors[i] != colors[(i + 1) % n]) {
                res += 1;
            }
        }
        return res;
    }
}
