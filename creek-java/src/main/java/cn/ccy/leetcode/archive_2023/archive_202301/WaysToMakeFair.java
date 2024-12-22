package cn.ccy.leetcode.archive_2023.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/28
 * @description https://leetcode.cn/problems/ways-to-make-a-fair-array/
 */
public class WaysToMakeFair {
    public static void main(String[] args) {

    }

    //2023-01-28 明天我的订婚宴，祝我成功！今天已累毕，cvd，么么哒
    public int waysToMakeFair(int[] nums) {
        int odd1 = 0, even1 = 0;
        int odd2 = 0, even2 = 0;
        for (int i = 0; i < nums.length; ++i) {
            if ((i & 1) != 0) {
                odd2 += nums[i];
            } else {
                even2 += nums[i];
            }
        }
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if ((i & 1) != 0) {
                odd2 -= nums[i];
            } else {
                even2 -= nums[i];
            }
            if (odd1 + even2 == odd2 + even1) {
                ++res;
            }
            if ((i & 1) != 0) {
                odd1 += nums[i];
            } else {
                even1 += nums[i];
            }
        }
        return res;
    }
}
