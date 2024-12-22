package cn.ccy.leetcode.archive_2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/29 20:52
 * @description https://leetcode.cn/problems/can-place-flowers/?envType=daily-question&envId=2023-09-29
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                if (count >= n) {
                    return true;
                }
                prev = i;
            }
        }
        if (prev < 0) {
            count += (m + 1) / 2;
        } else {
            count += (m - prev - 1) / 2;
        }
        return count >= n;
    }
}
