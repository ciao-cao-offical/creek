package cn.ccy.leetcode.archive_2024.archive_202411;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/17 00:19:49
 * @description https://leetcode.cn/problems/friends-of-appropriate-ages/?envType=daily-question&envId=2024-11-17
 */
public class NumFriendRequests {
    public static void main(String[] args) {

    }

    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);
        int left = 0, right = 0, ans = 0;
        for (int age : ages) {
            if (age < 15) {
                continue;
            }
            while (ages[left] <= 0.5 * age + 7) {
                ++left;
            }
            while (right + 1 < n && ages[right + 1] <= age) {
                ++right;
            }
            ans += right - left;
        }
        return ans;
    }
}
