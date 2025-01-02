package cn.ccy.leetcode._2024.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/23 0023 01:21:54
 * @description https://leetcode.cn/problems/longest-alternating-subarray/?envType=daily-question&envId=2024-01-23
 */
public class AlternatingSubarray {
    public static void main(String[] args) {

    }

    public int alternatingSubarray(int[] nums) {
        int len = -1;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] == (count % 2 == 0 ? 1 : -1)) {
                    count++;
                    
                } else {
                    break;
                }
            }

            len = Math.max(len, count != 0 ? count + 1 : -1);
        }

        return len;
    }
}
