package cn.ccy.leetcode.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/2 0002 20:55:36
 * @description https://leetcode.cn/problems/car-pooling/?envType=daily-question&envId=2023-12-02
 */
public class CarPooling {
    public static void main(String[] args) {

    }

    public boolean carPooling(int[][] trips, int capacity) {
        int toMax = 0;
        for (int[] trip : trips) {
            toMax = Math.max(toMax, trip[2]);
        }

        int[] diff = new int[toMax + 1];
        for (int[] trip : trips) {
            diff[trip[1]] += trip[0];
            diff[trip[2]] -= trip[0];
        }

        int count = 0;
        for (int i = 0; i <= toMax; ++i) {
            count += diff[i];
            if (count > capacity) {
                return false;
            }
        }
        return true;
    }
}
