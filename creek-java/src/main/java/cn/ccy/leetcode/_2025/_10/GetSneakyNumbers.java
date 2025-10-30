package cn.ccy.leetcode._2025._10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="">...</a>
 * @since 2025/10/31 00:13
 */
public class GetSneakyNumbers {
    public static void main(String[] args) {

    }

    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) == 2) {
                res.add(x);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
