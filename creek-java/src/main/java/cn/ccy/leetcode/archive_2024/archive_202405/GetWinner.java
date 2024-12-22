package cn.ccy.leetcode.archive_2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/19 21:59:41
 * @description https://leetcode.cn/problems/find-the-winner-of-an-array-game/description/?envType=daily-question&envId=2024-05-19
 */
public class GetWinner {
    public static void main(String[] args) {

    }

    public int getWinner(int[] arr, int k) {
        int prev = Math.max(arr[0], arr[1]);
        if (k == 1) {
            return prev;
        }
        int consecutive = 1;
        int maxNum = prev;
        int length = arr.length;
        for (int i = 2; i < length; i++) {
            int curr = arr[i];
            if (prev > curr) {
                consecutive++;
                if (consecutive == k) {
                    return prev;
                }
            } else {
                prev = curr;
                consecutive = 1;
            }
            maxNum = Math.max(maxNum, curr);
        }
        return maxNum;
    }
}
