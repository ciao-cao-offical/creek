package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/14 0014 22:08:15
 * @description https://leetcode.cn/problems/single-number/?envType=daily-question&envId=2023-10-14
 */
public class SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s ^= num;
        }
        return s;
    }
}
