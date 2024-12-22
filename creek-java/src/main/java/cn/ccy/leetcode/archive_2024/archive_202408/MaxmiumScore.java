package cn.ccy.leetcode.archive_2024.archive_202408;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/1 22:46:21
 * @description https://leetcode.cn/problems/uOAnQW/?envType=daily-question&envId=2024-08-01
 */
public class MaxmiumScore {
    public static void main(String[] args) {

    }

    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);

        int ans = 0;
        int tmp = 0;
        int odd = -1, even = -1;
        int end = cards.length - cnt;
        for (int i = cards.length - 1; i >= end; i--) {
            tmp += cards[i];
            if ((cards[i] & 1) != 0) {
                odd = cards[i];
            } else {
                even = cards[i];
            }
        }

        if ((tmp & 1) == 0) {
            return tmp;
        }

        for (int i = cards.length - cnt - 1; i >= 0; i--) {
            if ((cards[i] & 1) != 0) {
                if (even != -1) {
                    ans = Math.max(ans, tmp - even + cards[i]);
                    break;
                }
            }
        }

        for (int i = cards.length - cnt - 1; i >= 0; i--) {
            if ((cards[i] & 1) == 0) {
                if (odd != -1) {
                    ans = Math.max(ans, tmp - odd + cards[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
