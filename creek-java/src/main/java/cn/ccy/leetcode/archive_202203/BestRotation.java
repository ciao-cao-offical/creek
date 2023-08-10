package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/9
 * @description https://leetcode-cn.com/problems/smallest-rotation-with-highest-score/
 * ★★★★★ cv 差分数组
 */
public class BestRotation {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 0};
        System.out.println(new BestRotation().bestRotation(nums));
    }

    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            int low = (i + 1) % n;
            int high = (i - nums[i] + n + 1) % n;
            diffs[low]++;
            diffs[high]--;
            if (low >= high) {
                diffs[0]++;
            }
        }
        int bestIndex = 0;
        int maxScore = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            score += diffs[i];
            if (score > maxScore) {
                bestIndex = i;
                maxScore = score;
            }
        }
        return bestIndex;
    }
}
