package cn.ccy.leetcode._2025._08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/pascals-triangle/?envType=daily-question&envId=2025-08-01">118. 杨辉三角</a>
 * @since 2025/8/1 23:22
 */
public class Generate {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list_1 = new ArrayList<>();
        list_1.add(1);
        lists.add(list_1);
        if (numRows == 1) {
            return lists;
        }

        List<Integer> list_2 = new ArrayList<>();
        list_2.add(1);
        list_2.add(1);
        lists.add(list_2);
        if (numRows == 2) {
            return lists;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(list);
        }

        return lists;
    }
}
