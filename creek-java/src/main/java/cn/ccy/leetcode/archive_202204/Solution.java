package cn.ccy.leetcode.archive_202204;

import java.util.Random;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/25
 * @description https://leetcode-cn.com/problems/random-pick-index/
 */
public class Solution {
    public static void main(String[] args) {

    }

    int[] nums;
    private Random random;

    //方法一：哈希表 哈希表记录相同元素的下标，空间换时间
    //方法二：水塘抽样 时间换空间
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int ans = 0;
        for (int i = 0, cnt = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                cnt++;
                if (random.nextInt(cnt) == 0) {
                    ans = i;
                }
            }
        }
        return ans;
    }
}
