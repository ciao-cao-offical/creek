package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/26
 * @description https://leetcode-cn.com/problems/letter-case-permutation/
 * ★
 */
public class LetterCasePermutation {
    public static void main(String[] args) {

    }

    public List<String> letterCasePermutation(String s) {
        char[] chars = s.toCharArray();
        List<StringBuilder> sbs = new ArrayList<>();
        sbs.add(new StringBuilder());
        for (char c : chars) {
            int size = sbs.size();
            if (!Character.isLetter(c)) {
                for (StringBuilder sb : sbs) {
                    sb.append(c);
                }

            } else {
                for (int i = 0; i < size; i++) {
                    sbs.add(new StringBuilder(sbs.get(i)));
                    sbs.get(i).append(Character.toLowerCase(c));
                    sbs.get(size + i).append(Character.toUpperCase(c));
                }
            }
        }

        ArrayList<String> fr = new ArrayList<>();
        for (StringBuilder sb : sbs) {
            fr.add(sb.toString());
        }
        return fr;
    }
}
