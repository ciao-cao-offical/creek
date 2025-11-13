package cn.ccy.leetcode._2025._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-operations-to-move-ones-to-the-end/?envType=daily-question&envId=2025-11-13">3228. 将 1 移动到末尾的最大操作次数</a>
 * @since 2025/11/13 23:29
 */
public class MaxOperations {
    public static void main(String[] args) {

    }

    public int maxOperations(String s) {
        int countOne = 0;
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                while (i + 1 < s.length() && s.charAt(i + 1) == '0') {
                    i++;
                }
                ans += countOne;
            } else {
                countOne++;
            }
            i++;
        }
        return ans;
    }
}
