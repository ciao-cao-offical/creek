package cn.ccy.leetcode._2025._10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-resultant-array-after-removing-anagrams/?envType=daily-question&envId=2025-10-13">2273. 移除字母异位词后的结果数组</a>
 * @since 2025/10/13 22:14
 */
public class RemoveAnagrams {
    public static void main(String[] args) {

    }

    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);   // 结果数组
        int n = words.length;
        for (int i = 1; i < n; i++) {
            if (!compare(words[i], words[i - 1])) {
                res.add(words[i]);
            }
        }
        return res;
    }

    // 判断两个单词是否为字母异位词
    private boolean compare(String word1, String word2) {
        int[] freq = new int[26];
        for (char ch : word1.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            freq[ch - 'a']--;
        }
        for (int x : freq) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}
