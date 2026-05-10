package cn.ccy.leetcode._2026._05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/separate-the-digits-in-an-array/?envType=daily-question&envId=2026-05-11">2553. 分割数组中数字的数位</a>
 * @since 2026/5/11 00:05
 */
public class SeparateDigits {
    public static void main(String[] args) {

    }

    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int x : nums) {
            List<Integer> tmp = new ArrayList<>();
            while (x > 0) {
                tmp.add(x % 10);
                x /= 10;
            }
            for (int i = tmp.size() - 1; i >= 0; i--) {
                res.add(tmp.get(i));
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
