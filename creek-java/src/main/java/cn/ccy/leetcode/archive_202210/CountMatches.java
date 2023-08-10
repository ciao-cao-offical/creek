package cn.ccy.leetcode.archive_202210;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/29 0029
 * @description https://leetcode.cn/problems/count-items-matching-a-rule/
 */
public class CountMatches {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int checkIdx = "type".equals(ruleKey) ? 0 : "color".equals(ruleKey) ? 1 : 2;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(checkIdx))) {
                ans++;
            }
        }

        return ans;
    }
}
