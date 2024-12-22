package cn.ccy.leetcode.archive_2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/3 0003
 * @description https://leetcode.cn/problems/consecutive-numbers-sum/
 * ☆☆☆ cvd 加班继续赶需求 补打卡起作用 没有断连击，感恩，下不为例！
 */
public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(new ConsecutiveNumbersSum().consecutiveNumbersSum(5));
    }

    //数学
    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        int bound = 2 * n;
        for (int k = 1; k * (k + 1) <= bound; k++) {
            if (isKConsecutive(n, k)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isKConsecutive(int n, int k) {
        if (k % 2 == 1) {
            return n % k == 0;
        } else {
            return n % k != 0 && 2 * n % k == 0;
        }
    }
}
