package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/22 22:33:47
 * @description https://leetcode.cn/problems/sort-integers-by-the-power-value/?envType=daily-question&envId=2024-12-22
 */
public class GetKth {
    public static void main(String[] args) {

    }

    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = lo; i <= hi; ++i) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer u, Integer v) {
                if (getF(u) != getF(v)) {
                    return getF(u) - getF(v);
                } else {
                    return u - v;
                }
            }
        });
        return list.get(k - 1);
    }

    public int getF(int x) {
        if (x == 1) {
            return 0;
        } else if ((x & 1) != 0) {
            return getF(x * 3 + 1) + 1;
        } else {
            return getF(x / 2) + 1;
        }
    }
}
