package cn.ccy.leetcode._2023.archive_202305;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/2 0002 23:03:01
 * @description https://leetcode.cn/problems/powerful-integers/
 */
public class PowerfulIntegers {
    public static void main(String[] args) {

    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<Integer>();
        int value1 = 1;
        for (int i = 0; i < 21; i++) {
            int value2 = 1;
            for (int j = 0; j < 21; j++) {
                int value = value1 + value2;
                if (value <= bound) {
                    set.add(value);
                } else {
                    break;
                }
                value2 *= y;
            }
            if (value1 > bound) {
                break;
            }
            value1 *= x;
        }
        return new ArrayList<Integer>(set);
    }
}
