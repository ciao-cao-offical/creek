package cn.ccy.leetcode.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/9
 * @description https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
 */
public class MinimumRecolors {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        System.out.println(new MinimumRecolors().minimumRecolors(blocks, k));
    }

    //滑动窗口
    public int minimumRecolors(String blocks, int k) {
        int wNum = 0;
        char[] chars = blocks.toCharArray();
        for (int i = 0; i < k; i++) {
            if (chars[i] == 'W') {
                wNum++;
            }
        }

        int left = 0;
        int right = k - 1;
        int step = wNum;
        while (right < chars.length - 1) {
//            写法一
            if (chars[++right] == 'W') {
                wNum++;
            }
            if (chars[left++] == 'W') {
                wNum--;
            }
//            写法二 该写法耗时要高于写法1，but why?
//            wNum += (chars[++right] == 'W' ? 1 : 0);
//            wNum -= (chars[left++] == 'W' ? 1 : 0);

            if (wNum == 0) {
                return 0;
            }
            step = Math.min(step, wNum);
        }
        return step;
    }
}
