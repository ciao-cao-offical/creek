package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/6
 * @description https://leetcode-cn.com/problems/sum-of-unique-elements/
 */
public class SumOfUnique {
    public static void main(String[] args) {
        System.out.println(new SumOfUnique().sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }
        }

        int sum = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }

        return sum;
    }
}
