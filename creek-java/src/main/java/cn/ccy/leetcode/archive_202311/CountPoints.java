package cn.ccy.leetcode.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/2 0002 01:40:29
 * @description https://leetcode.cn/problems/rings-and-rods/?envType=daily-question&envId=2023-11-02
 * ☆ 2023b2t 看看官解的状态压缩：https://leetcode.cn/problems/rings-and-rods/solutions/1153686/huan-he-gan-by-leetcode-solution-88xj/?envType=daily-question&envId=2023-11-02
 */
public class CountPoints {
    public static void main(String[] args) {

    }

    static final int POLE_NUM = 10;
    static final int COLOR_NUM = 3;

    public int countPoints(String rings) {
        int[][] state = new int[POLE_NUM][COLOR_NUM];
        int n = rings.length();
        for (int i = 0; i < n; i += 2) {
            char color = rings.charAt(i);
            int poleIndex = rings.charAt(i + 1) - '0';
            state[poleIndex][getColorId(color)] = 1;
        }
        int res = 0;
        for (int i = 0; i < POLE_NUM; i++) {
            boolean flag = true;
            for (int j = 0; j < COLOR_NUM; j++) {
                if (state[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }
        return res;
    }

    public int getColorId(char color) {
        if (color == 'R') {
            return 0;
        } else if (color == 'G') {
            return 1;
        }
        return 2;
    }
}
