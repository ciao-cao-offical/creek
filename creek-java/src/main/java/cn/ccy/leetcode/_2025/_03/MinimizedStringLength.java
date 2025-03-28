package cn.ccy.leetcode._2025._03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimize-string-length/?envType=daily-question&envId=2025-03-28">2716. 最小化字符串长度</a>
 * @since 2025/3/28 21:50
 */
public class MinimizedStringLength {
    public static void main(String[] args) {

    }

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
