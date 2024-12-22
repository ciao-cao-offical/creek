package cn.ccy.leetcode.archive_2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/21 0021 00:22:01
 * @description https://leetcode.cn/problems/move-pieces-to-obtain-a-string/
 * cvd，晚上摔了一跤，浑身疼，早点睡...o(╥﹏╥)o
 */
public class CanChange {
    public static void main(String[] args) {

    }

    // cv from：https://leetcode.cn/problems/move-pieces-to-obtain-a-string/solutions/1658923/nao-jin-ji-zhuan-wan-pythonjavacgo-by-en-9sqt/
    public boolean canChange(String start, String target) {
        if (!start.replaceAll("_", "").equals(target.replaceAll("_", ""))) {
            return false;
        }
        for (int i = 0, j = 0; i < start.length(); i++) {
            if (start.charAt(i) == '_') {
                continue;
            }
            while (target.charAt(j) == '_') {
                j++;
            }
            if (i != j && (start.charAt(i) == 'L') == (i < j)) {
                return false;
            }
            ++j;
        }
        return true;
    }
}
