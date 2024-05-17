package cn.ccy.leetcode.archive_202405;

import javafx.util.Pair;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/17 20:33:08
 * @description https://leetcode.cn/problems/most-profit-assigning-work/?envType=daily-question&envId=2024-05-17
 */
public class MaxProfitAssignment {
    public static void main(String[] args) {

    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<Pair<Integer, Integer>> jobs = new ArrayList<>();
        int N = profit.length, res = 0, i = 0, best = 0;
        for (int j = 0; j < N; ++j) {
            jobs.add(new Pair<Integer, Integer>(difficulty[j], profit[j]));
        }
        Collections.sort(jobs, Comparator.comparing(Pair::getKey));
        Arrays.sort(worker);
        for (int w : worker) {
            while (i < N && w >= jobs.get(i).getKey()) {
                best = Math.max(best, jobs.get(i).getValue());
                i++;
            }
            res += best;
        }
        return res;
    }
}
