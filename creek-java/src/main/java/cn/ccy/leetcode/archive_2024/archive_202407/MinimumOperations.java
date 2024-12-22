package cn.ccy.leetcode.archive_2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/25 22:18:51
 * @description https://leetcode.cn/problems/minimum-operations-to-make-a-special-number/?envType=daily-question&envId=2024-07-25
 */
public class MinimumOperations {
    public static void main(String[] args) {

    }

    public int minimumOperations(String num) {
        int n = num.length();
        boolean find0 = false, find5 = false;
        for (int i = n - 1; i >= 0; --i) {
            if (num.charAt(i) == '0' || num.charAt(i) == '5') {
                if (find0) {
                    return n - i - 2;
                }
                if (num.charAt(i) == '0') {
                    find0 = true;
                } else {
                    find5 = true;
                }
            } else if (num.charAt(i) == '2' || num.charAt(i) == '7') {
                if (find5) {
                    return n - i - 2;
                }
            }
        }
        if (find0) {
            return n - 1;
        }
        return n;
    }
}
