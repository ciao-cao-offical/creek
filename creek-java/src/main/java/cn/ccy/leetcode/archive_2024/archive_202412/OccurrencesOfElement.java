package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/27 20:02:19
 * @description https://leetcode.cn/problems/find-occurrences-of-an-element-in-an-array/?envType=daily-question&envId=2024-12-27
 */
public class OccurrencesOfElement {
    public static void main(String[] args) {

    }

    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indices.add(i);
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (indices.size() < queries[i]) {
                res[i] = -1;
            } else {
                res[i] = indices.get(queries[i] - 1);
            }
        }
        return res;
    }
}
