package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-numbers-with-even-number-of-digits/?envType=daily-question&envId=2025-04-30">1295. 统计位数为偶数的数字</a>
 * @since 2025/4/30 23:03
 */
public class FindNumbers {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int c = 0;
            while (num > 0) {
                num = num / 10;
                c++;
            }
            if (c % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
