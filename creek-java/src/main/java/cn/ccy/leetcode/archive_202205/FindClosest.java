package cn.ccy.leetcode.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/27 0027
 * @description https://leetcode.cn/problems/find-closest-lcci/
 * ☆☆ cvd 赶需求，没时间啦
 */
public class FindClosest {
    public static void main(String[] args) {
        String[] words = {"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        String word1 = "a";
        String word2 = "student";
        System.out.println(new FindClosest().findClosest(words, word1, word2));
    }

    //一次遍历
    public int findClosest(String[] words, String word1, String word2) {
        int length = words.length;
        int ans = length;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                index1 = i;
            } else if (word.equals(word2)) {
                index2 = i;
            }
            if (index1 >= 0 && index2 >= 0) {
                ans = Math.min(ans, Math.abs(index1 - index2));
            }
        }
        return ans;
    }
}
