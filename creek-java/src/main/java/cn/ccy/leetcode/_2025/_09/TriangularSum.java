package cn.ccy.leetcode._2025._09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-triangular-sum-of-an-array/?envType=daily-question&envId=2025-09-30">2221. 数组的三角和</a>
 * @since 2025/9/30 01:03
 */
public class TriangularSum {
    public static void main(String[] args) {

    }

    public int triangularSum(int[] nums) {
        List<Integer> current = Arrays.stream(nums).boxed().collect(Collectors.toList());
        while (current.size() > 1) {
            List<Integer> newNums = new ArrayList<>();
            for (int i = 0; i < current.size() - 1; ++i) {
                newNums.add((current.get(i) + current.get(i + 1)) % 10);
            }
            current = newNums;
        }
        return current.get(0);
    }
}
