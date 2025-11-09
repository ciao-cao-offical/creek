package cn.ccy.leetcode._2025._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-operations-to-obtain-zero/?envType=daily-question&envId=2025-11-09">2169. 得到 0 的操作数</a>
 * @since 2025/11/10 00:12
 */
public class CountOperations {
    public static void main(String[] args) {

    }

    public int countOperations(int num1, int num2) {
        int res = 0;   // 相减操作的总次数
        while (num1 != 0 && num2 != 0) {
            // 每一步辗转相除操作
            res += num1 / num2;
            num1 %= num2;
            // 交换两个数
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        return res;
    }
}
