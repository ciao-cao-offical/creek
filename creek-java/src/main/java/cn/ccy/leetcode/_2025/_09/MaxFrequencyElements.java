package cn.ccy.leetcode._2025._09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2025-09-22">3005. 最大频率元素计数</a>
 * @since 2025/9/22 23:23
 */
public class MaxFrequencyElements {
    public static void main(String[] args) {

    }

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFre = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxFre = Math.max(maxFre, map.get(num));
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == maxFre) {
                count += integerIntegerEntry.getValue();
            }
        }

        return count;
    }
}
