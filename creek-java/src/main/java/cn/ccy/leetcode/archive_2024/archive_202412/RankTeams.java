package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/29 22:12:39
 * @description https://leetcode.cn/problems/rank-teams-by-votes/?envType=daily-question&envId=2024-12-29
 */
public class RankTeams {
    public static void main(String[] args) {

    }

    public String rankTeams(String[] votes) {
        int n = votes.length;
        // 初始化哈希映射
        Map<Character, int[]> ranking = new HashMap<>();
        for (char vid : votes[0].toCharArray()) {
            ranking.put(vid, new int[votes[0].length()]);
        }
        // 遍历统计
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); ++i) {
                ++ranking.get(vote.charAt(i))[i];
            }
        }

        // 取出所有的键值对
        List<Map.Entry<Character, int[]>> result = new ArrayList<>(ranking.entrySet());
        // 排序
        result.sort((a, b) -> {
            for (int i = 0; i < a.getValue().length; i++) {
                if (a.getValue()[i] != b.getValue()[i]) {
                    return b.getValue()[i] - a.getValue()[i];
                }
            }
            return a.getKey() - b.getKey();
        });

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, int[]> entry : result) {
            ans.append(entry.getKey());
        }
        return ans.toString();
    }
}
