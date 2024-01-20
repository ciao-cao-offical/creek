package cn.ccy.leetcode.archive_202401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/20 0020 23:23:02
 * @description https://leetcode.cn/problems/split-strings-by-separator/?envType=daily-question&envId=2024-01-20
 */
public class SplitWordsBySeparator {
    public static void main(String[] args) {

    }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int start = 0;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                if (c == separator) {
                    if (start < i) {
                        res.add(word.substring(start, i));
                    }
                    start = i + 1;
                }
            }
            if (start < len) {
                res.add(word.substring(start, len));
            }
        }

        return res;
    }
}
