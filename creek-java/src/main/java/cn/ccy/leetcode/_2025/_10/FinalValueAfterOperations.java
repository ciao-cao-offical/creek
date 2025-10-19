package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/?envType=daily-question&envId=2025-10-20">2011. 执行操作后的变量值</a>
 * @since 2025/10/20 00:23
 */
public class FinalValueAfterOperations {
    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if ("X++".equals(op) || "++X".equals(op)) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
