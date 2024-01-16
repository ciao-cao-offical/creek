package cn.ccy.leetcode.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/17 0017 00:36:43
 * @description https://leetcode.cn/problems/find-maximum-number-of-string-pairs/?envType=daily-question&envId=2024-01-17
 */
public class MaximumNumberOfStringPairs {
    public static void main(String[] args) {

    }

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String first = words[i];
            if (first == null) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                String second = words[j];
                if (second == null) {
                    continue;
                }

                if (isReverse(first, second)) {
                    count++;
                    words[i] = null;
                    words[j] = null;
                    break;
                }
            }
        }

        return count;
    }

    private boolean isReverse(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int len = first.length();
        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != second.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
