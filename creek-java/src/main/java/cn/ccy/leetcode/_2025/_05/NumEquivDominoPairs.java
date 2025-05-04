package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-equivalent-domino-pairs/description/?envType=daily-question&envId=2025-05-04">1128. 等价多米诺骨牌对的数量</a>
 * @since 2025/5/4 21:43
 */
public class NumEquivDominoPairs {
    public static void main(String[] args) {

    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
}
