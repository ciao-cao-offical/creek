package cn.ccy.leetcode._2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/21 17:21
 * @description https://leetcode.cn/problems/smallest-even-multiple/
 */
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(new SmallestEvenMultiple().smallestEvenMultiple(6));
    }

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }
}
