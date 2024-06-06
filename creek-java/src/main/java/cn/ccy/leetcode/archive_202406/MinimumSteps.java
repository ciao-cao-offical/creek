package cn.ccy.leetcode.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/6 21:39:47
 * @description https://leetcode.cn/problems/separate-black-and-white-balls/?envType=daily-question&envId=2024-06-06
 */
public class MinimumSteps {
    public static void main(String[] args) {

    }

    // 101 -> 011; 100 -> 001; 0111 -> 0111; 1110 -> 01111
    public long minimumSteps(String s) {
        long ans = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sum++;
            } else {
                ans += sum;
            }
        }
        return ans;
    }
}
