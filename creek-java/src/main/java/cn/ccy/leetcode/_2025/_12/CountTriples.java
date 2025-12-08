package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-square-sum-triples/?envType=daily-question&envId=2025-12-08">1925. 统计平方和三元组的数目</a>
 * @since 2025/12/8 22:32
 */
public class CountTriples {
    public static void main(String[] args) {

    }

    public int countTriples(int n) {
        int res = 0;
        // 枚举 a 与 b
        for (int a = 1; a <= n; ++a) {
            for (int b = 1; b <= n; ++b) {
                // 判断是否符合要求
                int c = (int) Math.sqrt(a * a + b * b + 1.0);
                if (c <= n && c * c == a * a + b * b) {
                    ++res;
                }
            }
        }
        return res;
    }
}
