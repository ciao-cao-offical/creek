package cn.ccy.leetcode._2025._03;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/convert-an-array-into-a-2d-array-with-conditions/?envType=daily-question&envId=2025-03-19">2610. 转换二维数组</a>
 * @since 2025/3/19 23:02
 */
public class FindMatrix {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        while (!cnt.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> it = cnt.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> entry = it.next();
                entry.setValue(entry.getValue() - 1);
                arr.add(entry.getKey());
                if (entry.getValue() == 0) {
                    it.remove();
                }
            }
            ans.add(arr);
        }

        return ans;
    }
}
