package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-collisions-on-a-road/?envType=daily-question&envId=2025-12-04">2211. 统计道路上的碰撞次数</a>
 * @since 2025/12/4 00:03
 */
public class CountCollisions {
    public static void main(String[] args) {

    }

    public int countCollisions(String directions) {
        int res = 0;
        int flag = -1;
        for (char c : directions.toCharArray()) {
            if (c == 'L') {
                if (flag >= 0) {
                    res += flag + 1;
                    flag = 0;
                }
            } else if (c == 'S') {
                if (flag > 0) {
                    res += flag;
                }
                flag = 0;
            } else {
                if (flag >= 0) {
                    flag++;
                } else {
                    flag = 1;
                }
            }
        }
        return res;
    }
}
