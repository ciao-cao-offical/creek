package cn.ccy.leetcode._2026._07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/rank-transform-of-an-array/?envType=daily-question&envId=2026-07-12">1331. 数组序号转换</a>
 * @since 2026/7/12 14:48
 */
public class ArrayRankTransform {
    public static void main(String[] args) {

    }

    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        int[] ans = new int[arr.length];
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;
    }
}
