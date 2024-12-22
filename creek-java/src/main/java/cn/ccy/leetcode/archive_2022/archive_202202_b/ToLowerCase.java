package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/26
 * @description 简要描述当前类の作用
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("Hello"));
    }

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }

        return String.valueOf(chars);
    }
}
