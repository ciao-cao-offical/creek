package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Objects;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/9 0009
 * @description https://leetcode-cn.com/problems/multiply-strings/
 * ☆☆☆ 试试【做加法】
 */
public class Multiply {
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        System.out.println(new Multiply().multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        if (Objects.equals(num1, "0") || Objects.equals(num2, "0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] ans = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';

                ans[i + j + 1] += x * y;
            }
        }

        //数据梳理
        for (int i = m + n - 1; i > 0; i--) {
            ans[i - 1] += ans[i] / 10;
            ans[i] = ans[i] % 10;
        }

        int start = ans[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < m + n; i++) {
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}
