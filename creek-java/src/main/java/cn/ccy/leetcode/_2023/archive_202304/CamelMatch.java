package cn.ccy.leetcode._2023.archive_202304;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/14 17:10
 * @description https://leetcode.cn/problems/camelcase-matching/
 */
public class CamelMatch {
    public static void main(String[] args) {

    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int n = queries.length;
        List<Boolean> res = new ArrayList<Boolean>();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int p = 0;
            for (int j = 0; j < queries[i].length(); j++) {
                char c = queries[i].charAt(j);
                if (p < pattern.length() && pattern.charAt(p) == c) {
                    p++;
                } else if (Character.isUpperCase(c)) {
                    flag = false;
                    break;
                }
            }
            if (p < pattern.length()) {
                flag = false;
            }
            res.add(flag);
        }
        return res;
    }
}
