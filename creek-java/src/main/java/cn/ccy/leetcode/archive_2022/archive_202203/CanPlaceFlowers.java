package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/31
 * @description https://leetcode-cn.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        int countOfZeros = 1;
        int canPlace = 0;
        for (int j : flowerbed) {
            if (j == 0) {
                countOfZeros++;

            } else {
                canPlace += (countOfZeros - 1) / 2;
                if (canPlace >= n) {
                    return true;
                }
                countOfZeros = 0;
            }
        }

        countOfZeros++;
        canPlace += (countOfZeros - 1) / 2;
        return canPlace >= n;
    }
}
