package cn.ccy.leetcode.archive_2024.archive_202404;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/18 22:47:31
 * @description https://leetcode.cn/problems/find-original-array-from-doubled-array/?envType=daily-question&envId=2024-04-18
 */
public class FindOriginalArray {
    public static void main(String[] args) {

    }

    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : changed) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        int[] res = new int[changed.length / 2];
        int i = 0;
        for (int a : changed) {
            if (count.get(a) == 0) {
                continue;
            }
            count.put(a, count.get(a) - 1);
            if (count.getOrDefault(a * 2, 0) == 0) {
                return new int[0];
            }
            count.put(a * 2, count.get(a * 2) - 1);
            res[i++] = a;
        }
        return res;
    }
}
