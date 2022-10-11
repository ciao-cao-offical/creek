package com.ciao.leetcode.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/11 0011
 * @description https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class AreAlmostEqual {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println(new AreAlmostEqual().areAlmostEqual(s1, s2));
    }

    //模拟 from：【宫水三叶】https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal/solution/by-ac_oier-qeul/
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length(), a = -1, b = -1;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            if (a == -1) a = i;
            else if (b == -1) b = i;
            else return false;
        }
        if (a == -1) return true;
        if (b == -1) return false;
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}
