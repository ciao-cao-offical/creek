package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/25 0025 21:17:05
 * @description https://leetcode.cn/problems/building-boxes/
 * cvd，生活会欺骗你，兄弟朋友、恋人也可能欺骗你，但是数学不会，因为数学不会就是不会，分数永远诚实，wuwuwuwuwuwu...
 */
public class MinimumBoxes {
    public static void main(String[] args) {

    }

    public int minimumBoxes(int n) {
        int cur = 1, i = 1, j = 1;
        while (n > cur) {
            n -= cur;
            i++;
            cur += i;
        }
        cur = 1;
        while (n > cur) {
            n -= cur;
            j++;
            cur++;
        }
        return (i - 1) * i / 2 + j;
    }
}
