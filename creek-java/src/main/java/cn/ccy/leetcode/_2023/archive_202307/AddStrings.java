package cn.ccy.leetcode._2023.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/17 0017 00:06:08
 * @description https://leetcode.cn/problems/add-strings/
 */
public class AddStrings {
    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("1", "9"));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        while (num1.length() != 0 || num2.length() != 0) {
            int a_1 = 0;
            if (num1.length() != 0) {
                a_1 = num1.charAt(num1.length() - 1) - '0';
                num1 = num1.substring(0, num1.length() - 1);
            }
            int a_2 = 0;
            if (num2.length() != 0) {
                a_2 = num2.charAt(num2.length() - 1) - '0';
                num2 = num2.substring(0, num2.length() - 1);
            }

            int sum = a_1 + a_2 + left;

            sb.append(sum % 10);
            left = sum / 10;

        }

        if (left != 0) {
            sb.append(left);
        }

        return sb.reverse().toString();
    }
}
