package cn.ccy.leetcode._2025._12;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/apple-redistribution-into-boxes/?envType=daily-question&envId=2025-12-24">3074. 重新分装苹果</a>
 * @since 2025/12/24 00:37
 */
public class MinimumBoxes {
    public static void main(String[] args) {

    }

    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) {
            sum += a;
        }

        Integer[] capArray = new Integer[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            capArray[i] = capacity[i];
        }

        Arrays.sort(capArray, Collections.reverseOrder());

        int need = 0;
        while (sum > 0) {
            sum -= capArray[need];
            need += 1;
        }

        return need;
    }
}
