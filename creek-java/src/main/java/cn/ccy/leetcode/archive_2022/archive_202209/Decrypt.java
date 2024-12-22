package cn.ccy.leetcode.archive_2022.archive_202209;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/24 0024
 * @description https://leetcode.cn/problems/defuse-the-bomb/
 * 试试答案的【滑动窗口】
 */
public class Decrypt {
    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};
        int k = -2;
        System.out.println(Arrays.toString(new Decrypt().decrypt(code, k)));
    }

    //简单模拟
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if (k == 0) {
            Arrays.fill(res, 0);

        } else if (k > 0) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % len];
                }
                res[i] = sum;
            }

        } else {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = -1; j >= k; j--) {
                    sum += code[i + j >= 0 ? i + j : len + i + j];
                }
                res[i] = sum;
            }
        }

        return res;
    }
}
