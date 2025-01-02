package cn.ccy.leetcode._2022.archive_202212;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/2 0002
 * @description https://leetcode.cn/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 */
public class MinOperations {
    public static void main(String[] args) {
        String boxes = "001011";
        System.out.println(Arrays.toString(new MinOperations().minOperations(boxes)));
    }

    //【双重循环模拟】，试试答案的【根据前一个盒子的操作数得到下一个盒子的操作数】https://leetcode.cn/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/solutions/2000188/yi-dong-suo-you-qiu-dao-mei-ge-he-zi-suo-y50e/
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] res = new int[len];
        char[] chars = boxes.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int step = 0;
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (chars[j] == '0') {
                    continue;
                }

                step += Math.abs(j - i);
            }

            res[i] = step;
        }
        return res;
    }
}
