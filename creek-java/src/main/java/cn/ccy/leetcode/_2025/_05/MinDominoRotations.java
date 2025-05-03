package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-domino-rotations-for-equal-row/?envType=daily-question&envId=2025-05-03">1007. 行相等的最少多米诺旋转</a>
 * @since 2025/5/3 20:52
 */
public class MinDominoRotations {
    public static void main(String[] args) {

    }

    /*
   Return min number of rotations
   if one could make all elements in A or B equal to x.
   Else return -1.
   */
    public int check(int x, int[] A, int[] B, int n) {
        // how many rotations should be done
        // to have all elements in A equal to x
        // and to have all elements in B equal to x
        int rotations_a = 0, rotations_b = 0;
        for (int i = 0; i < n; i++) {
            // rotations coudn't be done
            if (A[i] != x && B[i] != x) return -1;
                // A[i] != x and B[i] == x
            else if (A[i] != x) rotations_a++;
                // A[i] == x and B[i] != x
            else if (B[i] != x) rotations_b++;
        }
        // min number of rotations to have all
        // elements equal to x in A or B
        return Math.min(rotations_a, rotations_b);
    }

    public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        int rotations = check(A[0], B, A, n);
        // If one could make all elements in A or B equal to A[0]
        if (rotations != -1 || A[0] == B[0]) return rotations;
            // If one could make all elements in A or B equal to B[0]
        else return check(B[0], B, A, n);
    }
}
