package cn.ccy.leetcode.archive_202302;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/28 0028 23:00:33
 * @description https://leetcode.cn/problems/merge-similar-items/
 */
public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};
        System.out.println(new MergeSimilarItems().mergeSimilarItems(items1, items2));
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        map.forEach((key, value) -> {
            List<Integer> part = new ArrayList<Integer>() {{
                add(key);
                add(value);
            }};

            res.add(part);
        });
        res.sort(Comparator.comparingInt(o -> o.get(0)));

        return res;
    }
}
