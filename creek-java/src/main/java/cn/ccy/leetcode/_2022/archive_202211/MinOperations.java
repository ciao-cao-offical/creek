package cn.ccy.leetcode._2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/29 0029
 * @description https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string/
 */
public class MinOperations {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(new MinOperations().minOperations(s));
    }

    public int minOperations(String s) {
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c != ('0' + i % 2)) {
                count++;
            }
        }
        return Math.min(count, len - count);
    }
}
