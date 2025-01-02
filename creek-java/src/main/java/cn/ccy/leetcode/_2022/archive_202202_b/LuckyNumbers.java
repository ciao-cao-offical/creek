package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/15
 * @description https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 */
public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(new LuckyNumbers().luckyNumbers(matrix));
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> rms = new ArrayList<>();
        for (int[] value : matrix) {
            int min = Integer.MAX_VALUE;
            for (int rn : value) {
                min = Math.min(rn, min);
            }
            rms.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for (int[] ints : matrix) {
                max = Math.max(ints[i], max);
            }
            if (rms.contains(max)) {
                ans.add(max);
                break;
            }
        }
        return ans;
    }
}
