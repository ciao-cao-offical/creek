package cn.ccy.leetcode.archive_202410;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/9 00:27:53
 * @description https://leetcode.cn/problems/find-subarray-with-bitwise-or-closest-to-k/?envType=daily-question&envId=2024-10-09
 * ☆☆☆☆☆ 2024cvd
 */
public class MinimumDifference {
    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int[] bitsMaxPos = new int[31];
        Arrays.fill(bitsMaxPos, -1);
        List<int[]> posToBit = new ArrayList<int[]>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 30; j++) {
                if ((nums[i] >> j & 1) != 0) {
                    bitsMaxPos[j] = i;
                }
            }
            posToBit.clear();
            for (int j = 0; j <= 30; j++) {
                if (bitsMaxPos[j] != -1) {
                    posToBit.add(new int[]{bitsMaxPos[j], j});
                }
            }
            Collections.sort(posToBit, (a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
            int val = 0;
            for (int j = 0, p = 0; j < posToBit.size(); ) {
                while (j < posToBit.size() && posToBit.get(j)[0] == posToBit.get(p)[0]) {
                    val |= 1 << posToBit.get(j)[1];
                    j++;
                }
                res = Math.min(res, Math.abs(val - k));
                p = j;
            }
        }
        return res;
    }
}
