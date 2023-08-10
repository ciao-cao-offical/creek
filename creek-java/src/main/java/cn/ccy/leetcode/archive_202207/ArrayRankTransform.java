package cn.ccy.leetcode.archive_202207;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/28 0028
 * @description https://leetcode.cn/problems/rank-transform-of-an-array/
 */
public class ArrayRankTransform {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        System.out.println(Arrays.toString(new ArrayRankTransform().arrayRankTransform(arr)));
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : copy) {
            if (!map.containsKey(j)) {
                map.put(j, map.size() + 1);
            }
        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
