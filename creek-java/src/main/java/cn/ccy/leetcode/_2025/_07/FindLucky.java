package cn.ccy.leetcode._2025._07;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-lucky-integer-in-an-array/?envType=daily-question&envId=2025-07-05">1394. 找出数组中的幸运数</a>
 * @since 2025/7/5 21:32
 */
public class FindLucky {
    public static void main(String[] args) {

    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (key == value) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
