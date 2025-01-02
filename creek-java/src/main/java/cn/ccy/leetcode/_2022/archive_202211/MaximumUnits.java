package cn.ccy.leetcode._2022.archive_202211;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/15 0015
 * @description https://leetcode.cn/problems/maximum-units-on-a-truck/
 */
public class MaximumUnits {
    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        System.out.println(new MaximumUnits().maximumUnits(boxTypes, truckSize));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        int max = 0;
        for (int[] boxType : boxTypes) {
            if (truckSize == 0) {
                break;
            }

            if (truckSize >= boxType[0]) {
                truckSize -= boxType[0];
                max += boxType[0] * boxType[1];

            } else {
                max += truckSize * boxType[1];
                truckSize = 0;
            }
        }
        return max;
    }
}
