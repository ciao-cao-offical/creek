package cn.ccy.leetcode._2024.archive_202407;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/24 22:05:30
 * @description https://leetcode.cn/problems/relocate-marbles/?envType=daily-question&envId=2024-07-24
 * ☆☆☆ 2024cvd
 */
public class RelocateMarbles {
    public static void main(String[] args) {

    }

    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> ans = new ArrayList<Integer>();
        Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], true);
        }

        for (int i = 0; i < moveFrom.length; i++) {
            mp.remove(moveFrom[i]);
            mp.put(moveTo[i], true);
        }

        for (Map.Entry<Integer, Boolean> entry : mp.entrySet()) {
            ans.add(entry.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}
