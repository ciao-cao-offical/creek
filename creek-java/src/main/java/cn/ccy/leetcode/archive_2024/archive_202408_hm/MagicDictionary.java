package cn.ccy.leetcode.archive_2024.archive_202408_hm;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/12 00:00
 * @description https://leetcode.cn/problems/implement-magic-dictionary/?envType=daily-question&envId=2024-08-12
 */
public class MagicDictionary {
    public static void main(String[] args) {

    }

    private String[] words;

    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        words = dictionary;
    }

    public boolean search(String searchWord) {
        for (String word : words) {
            if (word.length() != searchWord.length()) {
                continue;
            }

            int diff = 0;
            for (int i = 0; i < word.length(); ++i) {
                if (word.charAt(i) != searchWord.charAt(i)) {
                    ++diff;
                    if (diff > 1) {
                        break;
                    }
                }
            }
            if (diff == 1) {
                return true;
            }
        }
        return false;
    }
}
