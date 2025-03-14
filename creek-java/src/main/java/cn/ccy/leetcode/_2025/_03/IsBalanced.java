package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-balanced-string/?envType=daily-question&envId=2025-03-14">3340. 检查平衡字符串</a>
 * @since 2025/3/14 22:08
 */
public class IsBalanced {
    public static void main(String[] args) {

    }

    public boolean isBalanced(String num) {
        int diff = 0, sign = 1;
        for (int i = 0; i < num.length(); ++i) {
            int d = num.charAt(i) - '0';
            diff += d * sign;
            sign = -sign;
        }
        return diff == 0;
    }
}
