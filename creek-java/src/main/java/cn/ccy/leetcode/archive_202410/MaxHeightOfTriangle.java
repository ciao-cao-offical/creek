package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/15 02:02:58
 * @description https://leetcode.cn/problems/maximum-height-of-a-triangle/?envType=daily-question&envId=2024-10-15
 */
public class MaxHeightOfTriangle {
    public static void main(String[] args) {

    }

    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(maxHeight(red, blue), maxHeight(blue, red));
    }

    public int maxHeight(int x, int y) {
        int i = 1;
        do {
            if (i % 2 == 1) {
                x -= i;
                if (x < 0) {
                    return i - 1;
                }
            } else {
                y -= i;
                if (y < 0) {
                    return i - 1;
                }
            }
            i++;
        } while (true);
    }
}
