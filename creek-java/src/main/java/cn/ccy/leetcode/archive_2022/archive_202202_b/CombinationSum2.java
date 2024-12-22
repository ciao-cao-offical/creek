package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/7
 * @description https://leetcode-cn.com/problems/combination-sum-ii/
 * ★★
 */
public class CombinationSum2 {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> comb = new ArrayList<>();
    private List<int[]> freq = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int candi : candidates) {
            int size = freq.size();
            if (freq.isEmpty() || freq.get(size - 1)[0] != candi) {
                freq.add(new int[]{candi, 1});

            } else {
                ++freq.get(size - 1)[1];
            }
        }
        dfs(0, target);
        return ans;
    }

    private void dfs(int pos, int rest) {
        if (rest == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        if (pos == freq.size() || rest < freq.get(pos)[0]) {
            return;
        }
        dfs(pos + 1, rest);
        int most = Math.min(rest / freq.get(pos)[0], freq.get(pos)[1]);
        for (int i = 1; i <= most; i++) {
            comb.add(freq.get(pos)[0]);
            dfs(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; i++) {
            comb.remove(comb.size() - 1);
        }
    }
}
