package cn.ccy.leetcode.archive_202406;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/2 22:46:24
 * @description https://leetcode.cn/problems/distribute-candies/?envType=daily-question&envId=2024-06-02
 */
public class DistributeCandies2 {
    public static void main(String[] args) {

    }

    /*public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : candyType) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int type = map.keySet().size();
        return Math.min(type, (candyType.length / 2));
    }*/

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<Integer>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
