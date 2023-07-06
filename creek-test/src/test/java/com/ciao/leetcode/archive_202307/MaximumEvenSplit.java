package com.ciao.leetcode.archive_202307;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/6 0006 21:25:42
 * @description https://leetcode.cn/problems/maximum-split-of-positive-even-integers/
 */
public class MaximumEvenSplit {
    public static void main(String[] args) {

    }

    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return res;
        }

        for (long i = 2; i <= finalSum; i += 2) {
            res.add(i);
            finalSum -= i;
        }

        int size = res.size();
        res.set(size - 1, res.get(size - 1) + finalSum);
        return res;
    }
}
