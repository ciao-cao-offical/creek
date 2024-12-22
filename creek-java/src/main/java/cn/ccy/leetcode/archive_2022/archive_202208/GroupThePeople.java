package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/12 0012
 * @description https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to/
 */
public class GroupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(new GroupThePeople().groupThePeople(groupSizes));
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            int size = list.size();
            int count = size / key;
            int i = 0;
            while (i < count) {
                List<Integer> part = new ArrayList<>();
                for (int j = 0; j < key; j++) {
                    part.add(list.get(i * key + j));
                }
                res.add(part);
                i++;
            }
        }

        return res;
    }
}
