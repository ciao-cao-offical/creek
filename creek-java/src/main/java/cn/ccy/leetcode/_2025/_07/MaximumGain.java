package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-score-from-removing-substrings/?envType=daily-question&envId=2025-07-23">1717. 删除子字符串的最大得分</a>
 * @since 2025/7/23 23:18
 */
public class MaximumGain {
    public static void main(String[] args) {

    }

    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            s = s.replace('a', '\0').replace('b', 'a').replace('\0', 'b');
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int cntA = 0, cntB = 0;
            while (i < s.length() && (s.charAt(i) == 'a' || s.charAt(i) == 'b')) {
                char c = s.charAt(i++);
                if (c == 'a') {
                    cntA++;
                } else {
                    if (cntA > 0) {
                        cntA--;
                        ans += x;
                    } else {
                        cntB++;
                    }
                }
            }
            ans += Math.min(cntA, cntB) * y;
        }
        return ans;
    }
}
