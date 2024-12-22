package cn.ccy.leetcode.archive_2022.archive_202210;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/15 0015
 * @description https://leetcode.cn/problems/build-an-array-with-stack-operations/
 */
public class BuildArray {
    public static void main(String[] args) {
        int[] target = {1, 3};
        int n = 3;
        System.out.println(new BuildArray().buildArray(target, n));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
            if (i == target[j]) {
                res.add("Push");
                j++;

            } else {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}
