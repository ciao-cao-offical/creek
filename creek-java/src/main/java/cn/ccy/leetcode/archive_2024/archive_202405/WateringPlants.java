package cn.ccy.leetcode.archive_2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/8 23:07:22
 * @description https://leetcode.cn/problems/watering-plants/?envType=daily-question&envId=2024-05-08
 */
public class WateringPlants {
    public static void main(String[] args) {

    }

    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int ans = 0;
        int rest = capacity;
        for (int i = 0; i < n; ++i) {
            if (rest >= plants[i]) {
                ++ans;
                rest -= plants[i];
            } else {
                ans += i * 2 + 1;
                rest = capacity - plants[i];
            }
        }
        return ans;
    }
}
