package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/8 00:14:08
 * @description https://leetcode.cn/problems/largest-3-same-digit-number-in-string/?envType=daily-question&envId=2025-01-08
 */
public class LargestGoodInteger {
    public static void main(String[] args) {

    }

    public String largestGoodInteger(String num) {
        char[] ca = num.toCharArray();
        int max = -1;
        for (int i = 0; i < ca.length - 2; i++) {
            if (ca[i] == ca[i + 1] && ca[i + 1] == ca[i + 2]) {
                max = Math.max(max, Integer.parseInt(num.substring(i, i + 3)));
            }
        }

        if (max == -1) {
            return "";

        } else if (max == 0) {
            return "000";

        } else {
            return String.valueOf(max);
        }
    }
}
