package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/total-waviness-of-numbers-in-range-i/?envType=daily-question&envId=2026-06-04">3751. 范围内总波动值 I</a>
 * @since 2026/6/4 00:29
 */
public class TotalWaviness {
    public static void main(String[] args) {

    }

    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int i = num1; i <= num2; i++) {
            total += getWaviness(i);
        }
        return total;
    }

    private int getWaviness(int x) {
        String s = Integer.toString(x);
        int waviness = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            boolean isPeak = s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
            boolean isValley = s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);
            if (isPeak || isValley) {
                waviness++;
            }
        }

        return waviness;
    }
}
