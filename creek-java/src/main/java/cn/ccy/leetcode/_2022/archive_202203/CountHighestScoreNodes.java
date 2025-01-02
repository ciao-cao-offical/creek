package cn.ccy.leetcode._2022.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/11
 * @description https://leetcode-cn.com/problems/count-nodes-with-the-highest-score/
 * ☆☆☆
 */
public class CountHighestScoreNodes {
    long maxScore = 0;
    int cnt = 0;
    int n;
    List<Integer>[] children;

    public static void main(String[] args) {
        int[] parents = {-1, 2, 0, 2, 0};
        System.out.println(new CountHighestScoreNodes().countHighestScoreNodes(parents));
    }

    public int countHighestScoreNodes(int[] parents) {
        n = parents.length;
        children = new List[n];
        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int p = parents[i];
            if (p != -1) {
                children[p].add(i);
            }
        }

        dfs(0);
        return cnt;
    }

    private int dfs(int node) {
        long score = 1L;
        int size = n - 1;
        for (int c : children[node]) {
            int t = dfs(c);
            score *= t;
            size -= t;
        }

        if (node != 0) {
            score *= size;
        }

        if (score == maxScore) {
            cnt++;

        } else if (score > maxScore) {
            maxScore = score;
            cnt = 1;
        }

        return n - size;
    }
}
