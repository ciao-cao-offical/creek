package cn.ccy.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/8 0008 23:16:17
 * @description https://leetcode.cn/problems/counting-words-with-a-given-prefix/
 */
public class PrefixCount {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println(new PrefixCount().prefixCount(words, pref));
    }

    //【模拟】
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                ++count;
            }
        }
        return count;
    }
}
