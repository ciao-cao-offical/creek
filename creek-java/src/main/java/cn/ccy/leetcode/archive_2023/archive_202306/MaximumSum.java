package cn.ccy.leetcode.archive_2023.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/27 0027 22:19:06
 * @description https://leetcode.cn/problems/maximum-subarray-sum-with-one-deletion/
 */
public class MaximumSum {
    public static void main(String[] args) {
        System.out.println(new MaximumSum().maximumSum(new int[]{-1, -1, -1, -1}));
    }

    //第二版
    public int maximumSum(int[] arr) {
        int len = arr.length;
        int r0 = arr[0];
        int r1 = 0;
        int res = arr[0];
        for (int i = 1; i < len; i++) {
            // 注意r1 和 r2 的赋值顺序
            r1 = Math.max(r1 + arr[i], r0);
            r0 = Math.max(r0, 0) + arr[i];
            res = Math.max(res, Math.max(r0, r1));
        }
        return res;
    }

    // 第一版
    /*public int maximumSum(int[] arr) {
        int len = arr.length;
        int[][] records = new int[len][2];
        records[0][0] = arr[0];
        records[0][1] = 0;
        int res = arr[0];
        for (int i = 1; i < len; i++) {
            records[i][0] = Math.max(records[i - 1][0], 0) + arr[i];
            records[i][1] = Math.max(records[i - 1][1] + arr[i], records[i - 1][0]);
            res = Math.max(res, Math.max(records[i][0], records[i][1]));
        }
        return res;
    }*/
}
