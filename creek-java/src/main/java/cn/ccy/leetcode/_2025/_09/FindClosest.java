package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-closest-person/?envType=daily-question&envId=2025-09-04">3516. 找到最近的人</a>
 * @since 2025/9/5 00:21
 */
public class FindClosest {
    public static void main(String[] args) {

    }

    public int findClosest(int x, int y, int z) {
        int dxz = Math.abs(x - z), dyz = Math.abs(y - z);
        if (dxz < dyz) {
            return 1;
        } else if (dxz > dyz) {
            return 2;
        } else {
            return 0;
        }
    }
}
