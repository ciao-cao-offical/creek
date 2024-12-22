package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/15
 * @description https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum2().twoSum(numbers, target)));
    }

    //二分法
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            int low = i + 1;
            int high = len - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int sum = numbers[i] + numbers[mid];
                if (sum == target) {
                    return new int[]{i + 1, mid + 1};

                } else if (sum < target) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    //以下代码超时
    /*public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int a = 0;
        int b = a + 1;
        while (a < len) {
            if (numbers[a] + numbers[b] == target) {
                return new int[]{a + 1, b + 1};
            }

            if (b == len - 1) {
                a++;
                b = a + 1;

            } else {
                b++;
            }
        }
        return new int[]{-1, -1};
    }*/
}
