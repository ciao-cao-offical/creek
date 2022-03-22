package com.ciao.leetcode.archive_202203;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/22 0022
 * @description https://leetcode-cn.com/problems/insert-delete-getrandom-o1/
 */
public class RandomizedSet {
    Map<Integer, Integer> dict;
    List<Integer> list;
    Random random = new Random();

    public RandomizedSet() {
        dict = new HashMap<>();
        list = new ArrayList<>();
    }

    public static void main(String[] args) {

    }

    public boolean insert(int val) {
        if (dict.containsKey(val)) {
            return false;
        }

        int index = list.size();
        dict.put(val, index);
        list.add(index, val);
        return true;
    }

    public boolean remove(int val) {
        if (!dict.containsKey(val)) {
            return false;
        }
        Integer index = dict.get(val);
        int lastIndex = list.size() - 1;
        Integer lastElement = list.get(lastIndex);
        list.set(index, lastElement);
        dict.put(lastElement, index);
        list.remove(lastIndex);
        dict.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
