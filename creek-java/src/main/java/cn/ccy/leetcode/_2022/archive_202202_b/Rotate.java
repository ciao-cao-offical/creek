package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/17
 * @description https://leetcode-cn.com/problems/rotate-array/
 */
public class Rotate {
    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        rotate.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] ints = new int[length];

        for (int i = 0; i < nums.length; i++) {
            ints[(i + k) % length] = nums[i];
        }

        System.arraycopy(ints, 0, nums, 0, length);
    }
}
