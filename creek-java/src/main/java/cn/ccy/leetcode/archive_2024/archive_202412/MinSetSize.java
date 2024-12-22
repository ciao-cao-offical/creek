package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/15 00:27:47
 * @description https://leetcode.cn/problems/reduce-array-size-to-the-half/?envType=daily-question&envId=2024-12-15
 */
public class MinSetSize {
    public static void main(String[] args) {

    }

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> occ = new ArrayList<>(freq.values());
        Collections.sort(occ, Collections.reverseOrder());
        int cnt = 0, ans = 0;
        for (int c : occ) {
            cnt += c;
            ans += 1;
            if (cnt * 2 >= arr.length) {
                break;
            }
        }
        return ans;
    }
}
