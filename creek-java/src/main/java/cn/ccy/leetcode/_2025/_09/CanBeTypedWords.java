package cn.ccy.leetcode._2025._09;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-words-you-can-type/?envType=daily-question&envId=2025-09-15">1935. 可以输入的最大单词数</a>
 * @since 2025/9/15 23:18
 */
public class CanBeTypedWords {
    public static void main(String[] args) {

    }

    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();   // 无法输入的字符集合
        for (char ch : brokenLetters.toCharArray()) {
            broken.add(ch);
        }
        int res = 0;   // 可以完全输入的单词数目
        boolean flag = true;   // 当前字符所在单词是否可被完全输入
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                // 当前字符为空格，检查上一个单词状态，更新数目并初始化 flag
                if (flag) {
                    ++res;
                }
                flag = true;
            } else if (broken.contains(ch)) {
                // 当前字符不可被输入，所在单词无法被完全输入，更新 flag
                flag = false;
            }
        }
        // 判断最后一个单词状态并更新数目
        if (flag) {
            ++res;
        }
        return res;
    }
}
