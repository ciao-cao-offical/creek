package cn.ccy.leetcode._2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/25 0025 18:29:15
 * @description https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal/
 * ★★★ cvd
 */
public class MinimumSwap {
    public static void main(String[] args) {

    }

    //喝醉了...cvd...
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char a = s1.charAt(i), b = s2.charAt(i);
            if (a == 'x' && b == 'y') {
                xy++;
            }
            if (a == 'y' && b == 'x') {
                yx++;
            }
        }
        if ((xy + yx) % 2 == 1) {
            return -1;
        }
        return xy / 2 + yx / 2 + xy % 2 + yx % 2;
    }
}
