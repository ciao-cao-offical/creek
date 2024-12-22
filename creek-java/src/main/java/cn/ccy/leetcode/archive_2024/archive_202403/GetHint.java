package cn.ccy.leetcode.archive_2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/10 0010 20:36:56
 * @description https://leetcode.cn/problems/bulls-and-cows/description/?envType=daily-question&envId=2024-03-10
 */
public class GetHint {
    public static void main(String[] args) {

    }

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int[] cntS = new int[10];
        int[] cntG = new int[10];
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bulls;
            } else {
                ++cntS[secret.charAt(i) - '0'];
                ++cntG[guess.charAt(i) - '0'];
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; ++i) {
            cows += Math.min(cntS[i], cntG[i]);
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}
