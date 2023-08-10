package cn.ccy.leetcode.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/28
 * @description https://leetcode-cn.com/problems/the-number-of-weak-characters-in-the-game/
 */
public class NumberOfWeakCharacters {
    public static void main(String[] args) {
        int[][] ints = {new int[]{2, 2}, new int[]{3, 3}};
        System.out.println(new NumberOfWeakCharacters().numberOfWeakCharacters(ints));
    }

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        int count = 0;
        int maxDef = 0;
        for (int[] p : properties) {
            if (p[1] < maxDef) {
                count++;

            } else {
                maxDef = p[1];
            }
        }
        return count;
    }
}
