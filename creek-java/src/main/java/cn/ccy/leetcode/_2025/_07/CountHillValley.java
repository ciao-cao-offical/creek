package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-hills-and-valleys-in-an-array/?envType=daily-question&envId=2025-07-27">2210. 统计数组中峰和谷的数量</a>
 * @since 2025/7/27 22:30
 */
public class CountHillValley {
    public static void main(String[] args) {

    }

    public int countHillValley(int[] nums) {
        int res = 0;   // 峰与谷的数量
        int n = nums.length;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == nums[i - 1]) {
                // 去重
                continue;
            }
            int left = 0;   // 左边可能的不相等邻居对应状态
            for (int j = i - 1; j >= 0; --j) {
                if (nums[j] > nums[i]) {
                    left = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    left = -1;
                    break;
                }
            }
            int right = 0;   // 右边可能的不相等邻居对应状态
            for (int j = i + 1; j < n; ++j) {
                if (nums[j] > nums[i]) {
                    right = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    right = -1;
                    break;
                }
            }
            if (left == right && left != 0) {
                // 此时下标 i 为峰或谷的一部分
                ++res;
            }
        }
        return res;
    }
}
