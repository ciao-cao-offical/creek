package cn.ccy.leetcode.archive_202406;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/10 12:39:21
 * @description https://leetcode.cn/problems/boats-to-save-people/?envType=daily-question&envId=2024-06-10
 */
public class NumRescueBoats {
    public static void main(String[] args) {

    }

    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int light = 0, heavy = people.length - 1;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                ++light;
            }
            --heavy;
            ++ans;
        }
        return ans;
    }
}
