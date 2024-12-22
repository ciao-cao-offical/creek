package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/10
 * @description https://leetcode-cn.com/problems/jump-game-ii/
 */
public class Jump {
    public static void main(String[] args) {
        System.out.println(new Jump().jump(new int[]{2, 3, 1, 1, 4}));
    }

    public int jump(int[] nums) {
        int len = nums.length;
        int steps = 0;
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < len - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }

        return steps;
    }
}
