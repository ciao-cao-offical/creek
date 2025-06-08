package cn.ccy.leetcode._2025._06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/lexicographical-numbers/?envType=daily-question&envId=2025-06-08">386. 字典序排数</a>
 * @since 2025/6/8 21:00
 */
public class LexicalOrder {
    public static void main(String[] args) {

    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            ret.add(number);
            if (number * 10 <= n) {
                number *= 10;
            } else {
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                number++;
            }
        }
        return ret;
    }
}
