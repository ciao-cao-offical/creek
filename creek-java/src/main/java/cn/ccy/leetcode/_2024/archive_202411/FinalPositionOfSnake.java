package cn.ccy.leetcode._2024.archive_202411;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/21 01:07:44
 * @description https://leetcode.cn/problems/snake-in-matrix/?envType=daily-question&envId=2024-11-21
 */
public class FinalPositionOfSnake {
    public static void main(String[] args) {

    }

    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;
        for (String c : commands) {
            if (c.charAt(0) == 'U') {
                ans -= n;
            } else if (c.charAt(0) == 'D') {
                ans += n;
            } else if (c.charAt(0) == 'L') {
                --ans;
            } else {
                ++ans;
            }
        }
        return ans;
    }
}
