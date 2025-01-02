package cn.ccy.leetcode._2022.archive_202204;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/13
 * @description https://leetcode-cn.com/problems/insert-delete-getrandom-o1/
 */
public class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public static void main(String[] args) {

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;

        } else {
            int size = list.size();
            map.put(val, size);
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int last_index = list.size() - 1;
        if (index == last_index) {
            map.remove(val);

        } else {
            Integer last = list.get(last_index);
            map.put(last, index);
            map.remove(val);
            list.set(index, last);
        }
        list.remove(last_index);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
