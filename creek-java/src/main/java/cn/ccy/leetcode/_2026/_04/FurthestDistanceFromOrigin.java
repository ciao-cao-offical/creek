package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/furthest-point-from-origin/description/?envType=daily-question&envId=2026-04-24">2833. 距离原点最远的点</a>
 * @since 2026/4/24 00:20
 */
public class FurthestDistanceFromOrigin {
    public static void main(String[] args) {

    }

    public int furthestDistanceFromOrigin(String moves) {
        int L = 0, R = 0, B = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                L++;
            } else if (c == 'R') {
                R++;
            } else {
                B++;
            }
        }
        return Math.abs(L - R) + B;
    }
}
