package cn.ccy.leetcode._2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/24
 * @description https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * ★★ 尝试一下【快排】
 */
public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int k = 2;
        System.out.println(Arrays.toString(new GetLeastNumbers().getLeastNumbers(arr, k)));
    }

    //简单排序
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
