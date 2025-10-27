package cn.ccy.leetcode._2025._10;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-laser-beams-in-a-bank/?envType=daily-question&envId=2025-10-27">2125. 银行中的激光束数量</a>
 * @since 2025/10/27 23:19
 */
public class NumberOfBeams {
    public static void main(String[] args) {

    }

    public int numberOfBeams(String[] bank) {
        int last = 0, ans = 0;
        for (String line : bank) {
            int cnt = (int) line.chars().filter(ch -> ch == '1').count();
            if (cnt != 0) {
                ans += last * cnt;
                last = cnt;
            }
        }
        return ans;
    }
}
