package cn.ccy.leetcode._2023.archive_202306;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/29 0029 22:34:24
 * @description https://leetcode.cn/problems/reconstruct-a-2-row-binary-matrix/solutions/2306023/zhong-gou-2-xing-er-jin-zhi-ju-zhen-by-l-if8v/
 * cvd 洗完澡直接DOTA2，我不信昨晚上输一晚上，今天还能再输一晚上！
 */
public class ReconstructMatrix {
    public static void main(String[] args) {

    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int sum = 0, two = 0;
        for (int i = 0; i < n; ++i) {
            if (colsum[i] == 2) {
                ++two;
            }
            sum += colsum[i];
        }
        if (sum != upper + lower || Math.min(upper, lower) < two) {
            return new ArrayList<List<Integer>>();
        }
        upper -= two;
        lower -= two;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < 2; ++i) {
            res.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; ++i) {
            if (colsum[i] == 2) {
                res.get(0).add(1);
                res.get(1).add(1);
            } else if (colsum[i] == 1) {
                if (upper > 0) {
                    res.get(0).add(1);
                    res.get(1).add(0);
                    --upper;
                } else {
                    res.get(0).add(0);
                    res.get(1).add(1);
                }
            } else {
                res.get(0).add(0);
                res.get(1).add(0);
            }
        }
        return res;
    }
}
