package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/29
 * @description https://leetcode-cn.com/problems/maximize-the-confusion-of-an-exam/
 */
public class MaxConsecutiveAnswers {
    public static void main(String[] args) {
        String answerKey = "TFFT";
        int k = 1;
        System.out.println(new MaxConsecutiveAnswers().maxConsecutiveAnswers(answerKey, k));
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));
    }

    private int maxConsecutiveChar(String answerKey, int k, char ch) {
        int len = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < len; right++) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left++) != ch ? 1 : 0;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
