package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/weighted-word-mapping/?envType=daily-question&envId=2026-06-13">3838. 带权单词映射</a>
 * @since 2026/6/13 00:31
 */
public class MapWordWeights {
    public static void main(String[] args) {

    }

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder(words.length);
        for (String word : words) {
            int s = 0;
            for (int i = 0; i < word.length(); i++) {
                s += weights[word.charAt(i) - 'a'];
            }
            ans.append((char) ('z' - s % 26));
        }
        return ans.toString();
    }
}
