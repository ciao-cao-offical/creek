package cn.ccy.leetcode.archive_202312;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/20 0020 00:10:39
 * @description https://leetcode.cn/problems/check-if-a-string-is-an-acronym-of-words/?envType=daily-question&envId=2023-12-20
 */
public class IsAcronym {
    public static void main(String[] args) {

    }

    public boolean isAcronym(List<String> words, String s) {
        int ws = words.size();
        int sl = s.length();
        if (ws != sl) {
            return false;
        }
        for (int i = 0; i < ws; i++) {
            if (s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
