package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/20 0020
 * @description https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class IsUnique {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(new IsUnique().isUnique(s));
    }

    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (Character c : astr.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
