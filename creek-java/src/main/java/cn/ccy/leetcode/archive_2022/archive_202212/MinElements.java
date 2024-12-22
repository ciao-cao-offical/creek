package cn.ccy.leetcode.archive_2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/16 0016 23:49:41
 * @description https://leetcode.cn/problems/minimum-elements-to-add-to-form-a-given-sum/description/
 */
public class MinElements {
    public static void main(String[] args) {
        int[] nums = {1, -1, 1};
        int limit = 3;
        int goal = -4;
        System.out.println(new MinElements().minElements(nums, limit, goal));
    }

    //【上取整】
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int x : nums) {
            sum += x;
        }
        long diff = Math.abs(sum - goal);
        return (int) ((diff + limit - 1) / limit);
    }
}
