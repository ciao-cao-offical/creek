package cn.ccy.leetcode.archive_202303;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    public static void main(String[] args) {

    }

    //哈希表
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (int num : nums) {
            if (set.contains(num + diff) && set.contains(num+2*diff)){
                ans++;
            }
        }
        return ans;
    }

    // 暴力轮询
    /*public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] != diff) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (nums[k] - nums[j] == diff) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }*/
}
