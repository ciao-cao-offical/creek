package cn.ccy.leetcode.archive_2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/20
 * @description https://leetcode.cn/problems/best-poker-hand/
 */
public class BestHand {
    public static void main(String[] args) {
        System.out.println(new BestHand().bestHand(new int[]{13, 2, 3, 1, 9}, new char[]{'a', 'a', 'a', 'a', 'a'}));
    }

    public String bestHand(int[] ranks, char[] suits) {
        int[] suitMap = new int[4];
        for (char suit : suits) {
            int idx = suit - 'a';
            suitMap[idx] += 1;
            if (suitMap[idx] == 5) {
                return "Flush";
            }
        }

        int[] rankMap = new int[13];
        int maxCount = 0;
        for (int rank : ranks) {
            int idx = rank - 1;
            rankMap[idx]++;
            if (rankMap[idx] == 3) {
                return "Three of a Kind";
            }

            maxCount = Math.max(maxCount, rankMap[idx]);
        }

        if (maxCount == 2) {
            return "Pair";

        } else {
            return "High Card";
        }
    }
}
