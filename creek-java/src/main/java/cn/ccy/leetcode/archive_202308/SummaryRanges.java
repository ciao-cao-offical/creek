package cn.ccy.leetcode.archive_202308;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/26 0026 14:11:40
 * @description https://leetcode.cn/problems/summary-ranges/
 */
public class SummaryRanges {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<String>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuilder temp = new StringBuilder(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(nums[high]);
            }
            ret.add(temp.toString());
        }
        return ret;
    }
}
