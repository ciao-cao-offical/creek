package cn.ccy.leetcode._2023.archive_202311;

import java.util.TreeSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/29 0029 00:53:18
 * @description https://leetcode.cn/problems/smallest-number-in-infinite-set/?envType=daily-question&envId=2023-11-29
 */
public class SmallestInfiniteSet {
    public static void main(String[] args) {

    }

    private int thres;
    private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        thres = 1;
        set = new TreeSet<>();
    }

    public int popSmallest() {
        if (set.isEmpty()) {
            int ans = thres;
            ++thres;
            return ans;
        }
        int ans = set.pollFirst();
        return ans;
    }

    public void addBack(int num) {
        if (num < thres) {
            set.add(num);
        }
    }
}
