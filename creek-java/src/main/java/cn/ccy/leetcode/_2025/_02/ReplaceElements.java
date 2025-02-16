package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/16 13:03
 * @description/link https://leetcode.cn/problems/replace-elements-with-greatest-element-on-right-side/?envType=daily-question&envId=2025-02-16
 */
public class ReplaceElements {
    public static void main(String[] args) {

    }

    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                res[i] = max;
                max = arr[i];
            } else {
                res[i] = max;
            }

        }
        res[res.length - 1] = -1;

        return res;
    }
}
