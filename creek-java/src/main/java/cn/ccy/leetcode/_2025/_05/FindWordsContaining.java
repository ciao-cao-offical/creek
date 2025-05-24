package cn.ccy.leetcode._2025._05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-words-containing-character/?envType=daily-question&envId=2025-05-24">2942. 查找包含给定字符的单词</a>
 * @since 2025/5/24 23:26
 */
public class FindWordsContaining {
    public static void main(String[] args) {

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        return res;
    }
}
