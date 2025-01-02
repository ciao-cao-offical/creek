package cn.ccy.leetcode._2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/13 0013 22:22:02
 * @description https://leetcode.cn/problems/check-if-the-sentence-is-pangram/
 */
public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(new CheckIfPangram().checkIfPangram(sentence));
    }

    public boolean checkIfPangram(String sentence) {
        int[] cnt = new int[26];
        int total = 26;
        for (char c : sentence.toCharArray()) {
            if (cnt[c - 'a'] == 0) {
                --total;
            }
            if (total == 0) {
                return true;
            }
            ++cnt[c - 'a'];
        }

        return false;
    }
}
