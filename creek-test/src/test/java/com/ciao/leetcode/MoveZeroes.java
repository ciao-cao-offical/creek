package com.ciao.leetcode;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/18
 * @description https://leetcode-cn.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int length = nums.length,a=0,b=0;
        while (b < length){
            if (nums[b] != 0){
                int temp = nums[b];
                nums[b] = nums[a];
                nums[a] = temp;
                a++;
            }
            b++;
        }
    }
}
