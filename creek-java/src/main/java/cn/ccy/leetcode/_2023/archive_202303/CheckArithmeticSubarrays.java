package cn.ccy.leetcode._2023.archive_202303;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/23 0023 22:34:06
 * @description https://leetcode.cn/problems/arithmetic-subarrays/
 */
public class CheckArithmeticSubarrays {
    public static void main(String[] args) {
        int[] nums = {4, 6, 5, 9, 3, 7}, l = {0, 0, 2}, r = {2, 3, 5};
        System.out.println(new CheckArithmeticSubarrays().checkArithmeticSubarrays(nums, l, r));
    }

    //模拟
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int len = l.length;
        for (int i = 0; i < len; i++) {
            int start = l[i];
            int end = r[i];
            if (end - start == 1) {
                ans.add(true);
                continue;
            }

            int[] temp = Arrays.copyOfRange(nums, start, end + 1);
            Arrays.sort(temp);
            int grep = temp[1] - temp[0];
            boolean flag = true;
            for (int j = 2; j < temp.length; j++) {
                if (temp[j] - temp[j - 1] != grep) {
                    flag = false;
                    break;
                }
            }
            ans.add(flag);
        }

        return ans;
    }
}
