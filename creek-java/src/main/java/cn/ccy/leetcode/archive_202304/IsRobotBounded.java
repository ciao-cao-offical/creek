package cn.ccy.leetcode.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/11 0011 23:10:22
 * @description https://leetcode.cn/problems/robot-bounded-in-circle/solutions/
 */
public class IsRobotBounded {
    public static void main(String[] args) {

    }

    public boolean isRobotBounded(String instructions) {
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dirIdx = 0;
        int x = 0;
        int y = 0;
        int len = instructions.length();
        for (int i = 0; i < len; i++) {
            char c = instructions.charAt(i);
            if (c == 'G') {
                x += dirs[dirIdx][0];
                y += dirs[dirIdx][1];

            } else if (c == 'L') {
                dirIdx += 3;
                dirIdx %= 4;

            } else {
                dirIdx++;
                dirIdx %= 4;
            }
        }
        return dirIdx != 0 || (x == 0 && y == 0);
    }
}
