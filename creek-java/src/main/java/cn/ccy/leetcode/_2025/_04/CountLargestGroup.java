package cn.ccy.leetcode._2025._04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-largest-group/?envType=daily-question&envId=2025-04-23">1399. 统计最大组的数目</a>
 * @since 2025/4/23 22:50
 */
public class CountLargestGroup {
    public static void main(String[] args) {

    }

    public int countLargestGroup(int n) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int maxValue = 0;
        for (int i = 1; i <= n; ++i) {
            int key = 0, i0 = i;
            while (i0 != 0) {
                key += i0 % 10;
                i0 /= 10;
            }
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, hashMap.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvpair : hashMap.entrySet()) {
            if (kvpair.getValue() == maxValue) {
                ++count;
            }
        }
        return count;
    }
}
