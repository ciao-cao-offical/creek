package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/14 0014
 * @description https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAnagrams {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(new FindAnagrams().findAnagrams(s, p));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.equals(p)) {
            ans.add(0);
            return ans;
        }
        int sl = s.length();
        int pl = p.length();
        if (sl < pl) {
            return ans;
        }

        int[] letterTable = new int[26];
        int diff = 0;
        for (int i = 0; i < pl; i++) {
            letterTable[s.charAt(i) - 'a']++;
            letterTable[p.charAt(i) - 'a']--;
        }

        for (int num : letterTable) {
            if (num != 0) {
                diff++;
            }
        }

        if (diff == 0) {
            ans.add(0);
        }

        for (int i = 0; i < sl - pl; i++) {
            //移除字符判断
            int letterToRemove = s.charAt(i) - 'a';
            if (letterTable[letterToRemove] == 1) {
                diff--;

            } else if (letterTable[letterToRemove] == 0) {
                diff++;
            }
            letterTable[letterToRemove]--;

            //新增字符判断
            int letterToAdd = s.charAt(i + pl) - 'a';
            if (letterTable[letterToAdd] == -1) {
                diff--;

            } else if (letterTable[letterToAdd] == 0) {
                diff++;
            }
            letterTable[letterToAdd]++;

            if (diff == 0) {
                ans.add(i + 1);
            }

        }

        return ans;
    }
}
