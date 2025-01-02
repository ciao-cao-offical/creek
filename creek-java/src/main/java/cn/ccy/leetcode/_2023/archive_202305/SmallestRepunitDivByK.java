package cn.ccy.leetcode._2023.archive_202305;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/10 18:27
 * @description https://leetcode.cn/problems/smallest-integer-divisible-by-k/
 */
public class SmallestRepunitDivByK {
    public static void main(String[] args) {

    }

    //注：看看官解的优化方法
    public int smallestRepunitDivByK(int k) {
        int n = 1;
        int resid = 1 % k;
        Set<Integer> set = new HashSet<>();
        set.add(resid);
        while (resid != 0) {
            resid = (resid * 10 + 1) % k;
            n++;
            if (set.contains(resid)) {
                return -1;
            }
            set.add(resid);
        }
        return n;
    }
}
