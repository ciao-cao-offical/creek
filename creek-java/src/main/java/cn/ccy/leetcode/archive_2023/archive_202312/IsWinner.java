package cn.ccy.leetcode.archive_2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/27 0027 00:21:17
 * @description https://leetcode.cn/problems/determine-the-winner-of-a-bowling-game/?envType=daily-question&envId=2023-12-27
 */
public class IsWinner {
    public static void main(String[] args) {
        int[] player1 = {10, 2, 2, 3};
        int[] player2 = {3, 8, 4, 5};
        new IsWinner().isWinner(player1, player2);
    }

    public int isWinner(int[] player1, int[] player2) {
        int sum_1 = 0;
        int sum_2 = 0;
        int ten_count_1 = 0;
        int ten_count_2 = 0;

        for (int i = 0; i < player1.length; i++) {
            if (i > 2) {
                if (player1[i - 3] == 10 && ten_count_1 != 0) {
                    ten_count_1--;
                }
                if (player2[i - 3] == 10 && ten_count_2 != 0) {
                    ten_count_2--;
                }
            }
            if (ten_count_1 > 0) {
                sum_1 += 2 * player1[i];
            } else {
                sum_1 += player1[i];
            }
            if (ten_count_2 > 0) {
                sum_2 += 2 * player2[i];
            } else {
                sum_2 += player2[i];
            }


            if (player1[i] == 10) {
                ten_count_1++;
            }
            if (player2[i] == 10) {
                ten_count_2++;
            }
        }

        if (sum_1 > sum_2) {
            return 1;
        }
        if (sum_1 < sum_2) {
            return 2;
        } else {
            return 0;
        }
    }
}
