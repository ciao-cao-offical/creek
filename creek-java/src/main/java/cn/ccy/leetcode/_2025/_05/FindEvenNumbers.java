package cn.ccy.leetcode._2025._05;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/finding-3-digit-even-numbers/?envType=daily-question&envId=2025-05-12">2094. 找出 3 位偶数</a>
 * @since 2025/5/12 23:18
 */
public class FindEvenNumbers {
    public static void main(String[] args) {

    }

    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> nums = new HashSet<>();
        int n = digits.length;
        // 遍历三个数位的下标
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    // 判断是否满足目标偶数的条件
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num >= 100 && num % 2 == 0) {
                        nums.add(num);
                    }
                }
            }
        }
        // 转化为升序排序的数组
        List<Integer> res = new ArrayList<>(nums);
        Collections.sort(res);
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            result[i] = res.get(i);
        }
        return result;
    }
}
