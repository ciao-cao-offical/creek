package cn.ccy.leetcode.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/21
 * @description https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(new CanMakeArithmeticProgression().canMakeArithmeticProgression(arr));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null) {
            return false;
        }
        int length = arr.length;
        if (length == 2) {
            return true;
        }
        Arrays.sort(arr);
        int dis = arr[1] - arr[0];
        for (int i = 2; i < length; i++) {
            if (dis != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
