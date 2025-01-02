package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/26
 * @description https://leetcode-cn.com/problems/combinations/
 */
public class Combine {
    private static final List<Integer> part = new ArrayList<>();
    private static final List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        List<List<Integer>> combine = new Combine().combine(1, 1);
        System.out.println(combine);
    }

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return result;
    }

    private void dfs(int cur, int n, int k) {
        if (part.size() + n - cur + 1 < k) {
            return;
        }
        if (part.size() == k) {
            result.add(new ArrayList<>(part));
            return;
        }
        part.add(cur);
        dfs(cur + 1, n, k);
        part.remove(part.size() - 1);
        dfs(cur + 1, n, k);
    }
}
