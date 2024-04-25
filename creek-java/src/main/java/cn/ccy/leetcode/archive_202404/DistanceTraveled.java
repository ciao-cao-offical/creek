package cn.ccy.leetcode.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/25 22:44:28
 * @description https://leetcode.cn/problems/total-distance-traveled/?envType=daily-question&envId=2024-04-25
 */
public class DistanceTraveled {
    public static void main(String[] args) {

    }

    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            ans += 50;
            if (additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }
        }
        return ans + mainTank * 10;
    }
}
