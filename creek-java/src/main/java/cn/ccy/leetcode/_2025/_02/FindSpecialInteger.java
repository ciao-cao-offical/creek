package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/17 23:14
 * @description/link https://leetcode.cn/problems/element-appearing-more-than-25-in-sorted-array/?envType=daily-question&envId=2025-02-17
 */
public class FindSpecialInteger {
    public static void main(String[] args) {

    }

    public int findSpecialInteger(int[] arr) {
        int count = 1;
        int cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == cur) {
                if (++count > arr.length / 4) {
                    return cur;
                }
            } else {
                count = 1;
                cur = arr[i];
            }
        }

        return cur;
    }
}
