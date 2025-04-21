package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://www.bilibili.com/video/BV1775BzxEud/?spm_id_from=333.1007.tianma.2-3-6.click&vd_source=c2c3d">2145. 统计隐藏数组数目</a>
 * @since 2025/4/21 23:26
 */
public class NumberOfArrays {
    public static void main(String[] args) {

    }

    public int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0, y = 0, cur = 0;
        for (int d : differences) {
            cur += d;
            x = Math.min(x, cur);
            y = Math.max(y, cur);
            if (y - x > upper - lower) {
                return 0;
            }
        }
        return (upper - lower) - (y - x) + 1;
    }
}
