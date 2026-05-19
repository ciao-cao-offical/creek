package cn.ccy.leetcode._2026._05;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-prefix-common-array-of-two-arrays/?envType=daily-question&envId=2026-05-20">2657. 找到两个数组的前缀公共数组</a>
 * @since 2026/5/20 00:18
 */
public class FindThePrefixCommonArray {
    public static void main(String[] args) {

    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        Set<Integer> cntA = new HashSet<>();
        Set<Integer> cntB = new HashSet<>();
        Set<Integer> cnt = new HashSet<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            cntA.add(A[i]);
            cntB.add(B[i]);
            if (cntB.contains(A[i])) {
                cnt.add(A[i]);
            }
            if (cntA.contains(B[i])) {
                cnt.add(B[i]);
            }
            ans[i] = cnt.size();
        }

        return ans;
    }
}
