package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/21
 * @description https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class AreAlmostEqual {
    public static void main(String[] args) {
        System.out.println(new AreAlmostEqual().areAlmostEqual("bank", "kanb"));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int len = s1.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(i);
            }
        }

        if (list.size() != 0 && list.size() != 2) {
            return false;
        }

        return s1.charAt(list.get(0)) == s2.charAt(list.get(1))
                && s1.charAt(list.get(1)) == s2.charAt(list.get(0));
    }
}
