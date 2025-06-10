package cn.ccy.leetcode._2025._06;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-difference-between-even-and-odd-frequency-i/?envType=daily-question&envId=2025-06-10">3442. 奇偶频次间的最大差值 I</a>
 * @since 2025/6/10 22:35
 */
public class MaxDifference {
    public static void main(String[] args) {
        System.out.println(new MaxDifference().maxDifference("tzt"));
    }

    public int maxDifference(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        int maxOdd = 0;
        int minEven = chars.length;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                minEven = Math.min(minEven, value);
            } else {
                maxOdd = Math.max(maxOdd, value);
            }
        }

        return maxOdd - minEven;
    }
}
