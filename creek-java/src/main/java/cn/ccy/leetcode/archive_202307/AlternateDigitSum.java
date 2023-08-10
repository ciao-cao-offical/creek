package cn.ccy.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/12 0012 01:36:00
 * @description https://leetcode.cn/problems/alternating-digit-sum/
 */
public class AlternateDigitSum {
    public static void main(String[] args) {
        System.out.println(new AlternateDigitSum().alternateDigitSum(521));
    }

    // 数学！！！这就是数学的力量吗？！
    public int alternateDigitSum(int n) {
        int res = 0, sign = 1;
        while (n > 0) {
            res += n % 10 * sign;
            sign = -sign;
            n /= 10;
        }
        return -sign * res;
    }

    /*public int alternateDigitSum(int n) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (n > 0) {
            queue.push(n % 10);
            n /= 10;
        }

        int sum = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            sum += (++count % 2 == 1 ? 1 : -1) * queue.poll();
        }
        return sum;
    }*/
}
