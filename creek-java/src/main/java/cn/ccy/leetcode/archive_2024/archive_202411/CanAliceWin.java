package cn.ccy.leetcode.archive_2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/30 22:22:39
 * @description https://leetcode.cn/problems/find-if-digit-game-can-be-won/?envType=daily-question&envId=2024-11-30
 */
public class CanAliceWin {
    public static void main(String[] args) {

    }

    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }
}
