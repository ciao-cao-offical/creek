package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * ★★
 */
public class FindAnagrams {
    public static void main(String[] args) {
        System.out.println(new FindAnagrams().findAnagrams("cbaebabacd", "abc"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return list;
        }
        int sl = s.length();
        int pl = p.length();
        if (pl > sl) {
            return list;
        }

        int[] count = new int[26];
        //滑动窗口
        for (int i = 0; i < pl; i++) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }
        int diff = 0;
        for (int i : count) {
            if (i != 0) {
                diff++;
            }
        }
        if (diff == 0) {
            list.add(0);
        }

        for (int i = 0; i < sl - pl; i++) {
            int si = s.charAt(i) - 'a';
            if (count[si] == 1) {
                diff--;

            } else if (count[si] == 0) {
                diff++;
            }
            count[si]--;

            int ei = s.charAt(i + pl) - 'a';
            if (count[ei] == -1) {
                diff--;

            } else if (count[ei] == 0) {
                diff++;
            }
            count[ei]++;

            if (diff == 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
