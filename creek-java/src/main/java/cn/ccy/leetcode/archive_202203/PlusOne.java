package cn.ccy.leetcode.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/5
 * @description https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        if (digits[0] == 0) {
            return new int[]{1};
        }
        int len = digits.length;
        int j = 1;
        for (int i = len - 1; i >= 0; i--) {
            int r = digits[i] + j;
            if (r > 9) {
                digits[i] -= 9;

            } else {
                j = 0;
                digits[i] = r;
                break;
            }
        }
        if (j != 0) {
            int[] ans = new int[len + 1];
            ans[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                ans[i + 1] = digits[i];
            }
            digits = ans;
        }
        return digits;
    }
}
