package cn.ccy.leetcode._2025._12;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/delete-columns-to-make-sorted-ii/?envType=daily-question&envId=2025-12-21">955. 删列造序 II</a>
 * @since 2025/12/21 20:27
 */
public class MinDeletionSize2 {
    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] A) {
        int N = A.length;
        int W = A[0].length();
        int ans = 0;

        // cur : all rows we have written
        // For example, with A = ["abc","def","ghi"] we might have
        // cur = ["ab", "de", "gh"].
        String[] cur = new String[N];
        for (int j = 0; j < W; ++j) {
            // cur2 : What we potentially can write, including the
            //        newest column col = [A[i][j] for i]
            // Eg. if cur = ["ab","de","gh"] and col = ("c","f","i"),
            // then cur2 = ["abc","def","ghi"].
            String[] cur2 = Arrays.copyOf(cur, N);
            for (int i = 0; i < N; ++i) {
                cur2[i] += A[i].charAt(j);
            }
            if (isSorted(cur2)) {
                cur = cur2;
            } else {
                ans++;
            }
        }

        return ans;
    }

    public boolean isSorted(String[] A) {
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i].compareTo(A[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }
}
