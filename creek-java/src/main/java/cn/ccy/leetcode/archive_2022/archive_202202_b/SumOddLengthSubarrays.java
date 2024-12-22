package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/23
 * @description https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 */
public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(new SumOddLengthSubarrays().sumOddLengthSubarrays(arr));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int[] prefixSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        int sum = 0;
        for (int start = 0; start < len; start++) {
            for (int gap = 1; start + gap <= len; gap += 2) {
                sum += prefixSum[start + gap] - prefixSum[start];
            }
        }

        return sum;
    }
}
