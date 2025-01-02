package cn.ccy.leetcode._2022.archive_202210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/26 0026
 * @description https://leetcode.cn/problems/number-of-squareful-arrays/
 * cvd，妄图寻找【1024】！
 */
public class NumSquarefulPerms {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> count;
    Map<Integer, List<Integer>> graph;

    public int numSquarefulPerms(int[] A) {
        int N = A.length;
        count = new HashMap();
        graph = new HashMap();

        // count.get(v) : 数组 A 中值为 v 的节点数量
        for (int x : A)
            count.put(x, count.getOrDefault(x, 0) + 1);

        // graph.get(v) : 在 A 中的值 w 满足 v + w 是完全平方数
        //                (ie., "vw" is an edge)
        for (int x : count.keySet())
            graph.put(x, new ArrayList());

        for (int x : count.keySet())
            for (int y : count.keySet()) {
                int r = (int) (Math.sqrt(x + y) + 0.5);
                if (r * r == x + y)
                    graph.get(x).add(y);
            }

        // 增加从 x 开始的可行路径数量
        int ans = 0;
        for (int x : count.keySet())
            ans += dfs(x, N - 1);
        return ans;
    }

    public int dfs(int x, int todo) {
        count.put(x, count.get(x) - 1);
        int ans = 1;
        if (todo != 0) {
            ans = 0;
            for (int y : graph.get(x))
                if (count.get(y) != 0) {
                    ans += dfs(y, todo - 1);
                }
        }
        count.put(x, count.get(x) + 1);
        return ans;
    }
}
