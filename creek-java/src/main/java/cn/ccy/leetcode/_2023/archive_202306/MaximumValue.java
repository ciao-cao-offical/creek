package cn.ccy.leetcode._2023.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/23 0023 19:21:25
 * @description https://leetcode.cn/problems/maximum-value-of-a-string-in-an-array/
 */
public class MaximumValue {
    public static void main(String[] args) {

    }

    public int maximumValue(String[] strs) {
        int max = -1;
        for (String str : strs) {
            boolean haveLetter = false;
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    haveLetter = true;
                    break;
                }
            }
            int num = -1;
            if (haveLetter) {
                num = str.length();
            } else {
                num = Integer.parseInt(str);
            }

            max = Math.max(max, num);
        }
        return max;
    }
}
