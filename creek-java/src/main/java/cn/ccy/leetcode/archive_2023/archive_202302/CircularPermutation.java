package cn.ccy.leetcode.archive_2023.archive_202302;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/23 0023 22:57:21
 * @description https://leetcode.cn/problems/circular-permutation-in-binary-representation/
 * ★★★ cvd，学习一下【89. 格雷编码：https://leetcode.cn/problems/gray-code/】{@link GrayCode}
 */
public class CircularPermutation {
    public static void main(String[] args) {
        int n = 2, start = 3;
        System.out.println(new CircularPermutation().circularPermutation(n, start));
    }

    //【归纳法】
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(start);
        for (int i = 1; i <= n; i++) {
            int m = ret.size();
            for (int j = m - 1; j >= 0; j--) {
                ret.add(((ret.get(j) ^ start) | (1 << (i - 1))) ^ start);
            }
        }
        return ret;
    }
}
