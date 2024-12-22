package cn.ccy.leetcode.archive_2022.archive_202207;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/14
 * @description https://leetcode.cn/problems/prefix-and-suffix-search/
 * ★★★★★ cvd
 */
public class WordFilter {
    public static void main(String[] args) {

    }

    Map<String, Integer> dictionary;

    public WordFilter(String[] words) {
        dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int m = word.length();
            for (int prefixLength = 1; prefixLength <= m; prefixLength++) {
                for (int suffixLength = 1; suffixLength <= m; suffixLength++) {
                    dictionary.put(word.substring(0, prefixLength) + "#" + word.substring(m - suffixLength), i);
                }
            }
        }
    }

    public int f(String pref, String suff) {
        return dictionary.getOrDefault(pref + "#" + suff, -1);
    }
}
