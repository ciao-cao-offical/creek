package cn.ccy.leetcode._2026._04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/words-within-two-edits-of-dictionary/description/?envType=daily-question&envId=2026-04-22">2452. 距离字典两次编辑以内的单词</a>
 * @since 2026/4/22 00:04
 */
public class TwoEditWords {
    public static void main(String[] args) {

    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            for (String s : dictionary) {
                int dis = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != s.charAt(i)) {
                        dis++;
                    }
                }
                if (dis <= 2) {
                    ans.add(query);
                    break;
                }
            }
        }
        return ans;
    }
}
