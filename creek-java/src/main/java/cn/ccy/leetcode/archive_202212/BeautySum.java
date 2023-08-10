package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/12 0012 22:56:24
 * @description https://leetcode.cn/problems/sum-of-beauty-of-all-substrings/
 */
public class BeautySum {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(new BeautySum().beautySum(s));
    }

    //【双重循环】
    public int beautySum(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            int[] cnt = new int[26];
            int maxFreq = 0;
            for (int j = i; j < len; j++) {
                ++cnt[chars[j] - 'a'];
                maxFreq = Math.max(maxFreq, cnt[chars[j] - 'a']);

                int minFreq = len;
                for (int k = 0; k < 26; k++) {
                    if (cnt[k] > 0) {
                        minFreq = Math.min(minFreq, cnt[k]);
                    }
                }

                res += maxFreq - minFreq;
            }
        }
        return res;
    }
}
