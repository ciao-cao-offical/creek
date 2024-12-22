package cn.ccy.leetcode.archive_2023.archive_202302;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/18 0018 15:05:20
 * @description https://leetcode.cn/problems/find-positive-integer-solution-for-a-given-equation/description/
 */
public class FindSolution {
    public static void main(String[] args) {

    }

    //【二分法】
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            int left = 1;
            int right = 1000;
            while (left <= right) {
                int mid = (left + right) / 2;
                int f = customfunction.f(i, mid);
                if (f == z) {
                    List<Integer> part = new ArrayList<>();
                    part.add(i);
                    part.add(mid);
                    res.add(part);
                    break;
                }
                if (z < f) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
        }
        return res;
    }

    interface CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y);
    }
}
