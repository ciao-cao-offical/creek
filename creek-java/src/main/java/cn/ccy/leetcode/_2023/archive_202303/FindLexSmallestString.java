package cn.ccy.leetcode._2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/19 0019 20:47:36
 * @description https://leetcode.cn/problems/lexicographically-smallest-string-after-applying-operations/
 */
public class FindLexSmallestString {
    public static void main(String[] args) {
        String s = "5525";
        int a = 9, b = 2;
        System.out.println(new FindLexSmallestString().findLexSmallestString(s, a, b));
    }

    // 枚举
    public String findLexSmallestString(String s, int a, int b) {
        int len = s.length();
        boolean[] vis = new boolean[len];
        String ds = s + s;// 方便截取
        String res = s;
        for (int i = 0; !vis[i]; i = (i + b) % len) {
            vis[i] = true;
            //奇数位变换
            for (int j = 0; j < 10; j++) {
                int kLimit = b % 2 == 0 ? 0 : 9;
                for (int k = 0; k <= kLimit; k++) {
                    char[] t = ds.substring(i, i + len).toCharArray();
                    for (int p = 1; p < len; p += 2) {
                        t[p] = (char) ('0' + (t[p] - '0' + j * a) % 10);
                    }
                    for (int p = 0; p < len; p += 2) {
                        t[p] = (char) ('0' + (t[p] - '0' + k * a) % 10);
                    }

                    String nStr = new String(t);
                    if (nStr.compareTo(res) < 0) {
                        res = nStr;
                    }
                }
            }
        }
        return res;
    }
}
