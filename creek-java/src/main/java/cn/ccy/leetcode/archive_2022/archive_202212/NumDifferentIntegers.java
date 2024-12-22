package cn.ccy.leetcode.archive_2022.archive_202212;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/6 0006
 * @description https://leetcode.cn/problems/number-of-different-integers-in-a-string/
 */
public class NumDifferentIntegers {
    public static void main(String[] args) {
        String word = "a1b01c001";
        System.out.println(new NumDifferentIntegers().numDifferentIntegers(word));
    }

    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                continue;
            }

            int j;
            for (j = i + 1; j < chars.length; j++) {
                if (chars[j] < '0' || chars[j] > '9') {
                    break;
                }
                if (chars[i] == '0') {
                    i = j;
                }
            }

            set.add(word.substring(i, j));
            i = j;
        }

        return set.size();
    }
}
