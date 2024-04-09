package cn.ccy.leetcode.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/10 01:03:19
 * @description https://leetcode.cn/problems/maximum-binary-string-after-change/?envType=daily-question&envId=2024-04-10
 */
public class MaximumBinaryString {
    public static void main(String[] args) {

    }

    public String maximumBinaryString(String binary) {
        int n = binary.length();
        char[] s = binary.toCharArray();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') {
                while (j <= i || (j < n && s[j] == '1')) {
                    j++;
                }
                if (j < n) {
                    s[j] = '1';
                    s[i] = '1';
                    s[i + 1] = '0';
                }
            }
        }
        return new String(s);
    }
}
