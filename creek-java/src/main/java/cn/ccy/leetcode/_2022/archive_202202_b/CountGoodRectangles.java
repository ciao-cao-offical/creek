package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/4
 * @description https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 */
public class CountGoodRectangles {
    public static void main(String[] args) {
        System.out.println(new CountGoodRectangles().countGoodRectangles(new int[][]{new int[]{5, 8}, new int[]{3, 9}, new int[]{5, 12}, new int[]{16, 5}}));
    }

    public int countGoodRectangles(int[][] rectangles) {
        if (rectangles == null) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] rect : rectangles) {
            if (rect == null) {
                continue;
            }

            int key = Math.min(rect[0], rect[1]);
            Integer count = map.get(key);
            if (count == null) {
                map.put(key, 1);

            } else {
                map.put(key, ++count);
            }
        }

        int ans = 0;
        for (Integer key : map.keySet()) {
            ans = Math.max(ans, key);
        }
        return map.get(ans);
    }
}
