package cn.ccy.leetcode._2022.archive_202204;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/1
 * @description https://leetcode-cn.com/problems/array-of-doubled-pairs/
 * ☆☆ 试一试【「逐个构造」&「成组构造」&「拓扑排序」】-【宫水三叶】
 */
public class CanReorderDoubled {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 6};
        System.out.println(new CanReorderDoubled().canReorderDoubled(arr));
    }

    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        //判断0的个数是否为零或偶数
        if (map.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }

        List<Integer> list = map.keySet().stream().sorted(Comparator.comparingInt(Math::abs)).collect(Collectors.toList());
        for (Integer key : list) {
            if (map.getOrDefault(2 * key, 0) < map.get(key)) {
                return false;
            }

            map.put(2 * key, map.getOrDefault(2 * key, 0) - map.get(key));
        }

        return true;
    }
}
