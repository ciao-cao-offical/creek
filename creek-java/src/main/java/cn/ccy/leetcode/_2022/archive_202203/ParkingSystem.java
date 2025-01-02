package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/1
 * @description https://leetcode-cn.com/problems/design-parking-system/
 * 复杂设计，留作纪念，警示！
 */
public class ParkingSystem {
    int[][] parking;

    public ParkingSystem(int big, int medium, int small) {
        int[] pb = {big, 0};
        int[] pm = {medium, 0};
        int[] ps = {small, 0};
        parking = new int[][]{pb, pm, ps};

    }

    public static void main(String[] args) {

    }

    public boolean addCar(int carType) {
        int[] p = parking[carType - 1];
        if (p[1] + 1 <= p[0]) {
            p[1]++;
            return true;
        }
        return false;
    }
}
