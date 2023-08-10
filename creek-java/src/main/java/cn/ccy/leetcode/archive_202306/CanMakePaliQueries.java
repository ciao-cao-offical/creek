package cn.ccy.leetcode.archive_202306;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/15 0015 23:17:56
 * @description https://leetcode.cn/problems/can-make-palindrome-from-substring/
 * ★★★★★ cvd，有机会看一下灵神的答案：https://leetcode.cn/problems/can-make-palindrome-from-substring/solutions/2309725/yi-bu-bu-you-hua-cong-qian-zhui-he-dao-q-yh5p/
 */
public class CanMakePaliQueries {
    public static void main(String[] args) {

    }

    // WTF，前缀和+异或 = 疑惑死我了...上一天班，头要炸了，脑袋不动了...
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[i + 1] = count[i] ^ (1 << (s.charAt(i) - 'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1], k = queries[i][2];
            int bits = 0, x = count[r + 1] ^ count[l];
            while (x > 0) {
                x &= x - 1;
                bits++;
            }
            res.add(bits <= k * 2 + 1);
        }
        return res;
    }
}
