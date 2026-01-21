package cn.ccy.leetcode._2026._01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-pair-removal-to-sort-array-i/?envType=daily-question&envId=2026-01-22">3507. 移除最小数对使数组有序 I</a>
 * @since 2026/1/22 01:27
 */
public class MinimumPairRemoval {
    public static void main(String[] args) {

    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int count = 0;

        while (list.size() > 1) {
            boolean isAscending = true;
            int minSum = Integer.MAX_VALUE;
            int targetIndex = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (list.get(i) > list.get(i + 1)) {
                    isAscending = false;
                }

                if (sum < minSum) {
                    minSum = sum;
                    targetIndex = i;
                }
            }

            if (isAscending) {
                break;
            }

            count++;
            list.set(targetIndex, minSum);
            list.remove(targetIndex + 1);
        }

        return count;
    }
}
