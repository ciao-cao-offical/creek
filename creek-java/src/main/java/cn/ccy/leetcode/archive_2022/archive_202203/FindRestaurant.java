package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/14 0014
 * @description https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 */
public class FindRestaurant {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(new FindRestaurant().findRestaurant(list1, list2)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int indexSum = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            Integer i = map.get(list2[j]);
            if (i != null) {
                if (i + j < indexSum) {
                    ans.clear();
                    ans.add(list2[j]);
                    indexSum = i + j;

                } else if (i + j == indexSum) {
                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}
