package cn.ccy.leetcode.archive_2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/14 0014
 * @description https://leetcode.cn/problems/maximum-score-after-splitting-a-string/
 */
public class MaxScore {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(new MaxScore().maxScore(s));
    }

    //两次遍历
    public int maxScore(String s) {
        int score = s.charAt(0) == '0' ? 1 : 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }
        int ans = score;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                score++;

            } else {
                score--;
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }
}
