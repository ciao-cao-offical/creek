package cn.ccy.leetcode.archive_2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/30 0030 01:20:13
 * @description https://leetcode.cn/problems/h-index-ii/?envType=daily-question&envId=2023-10-30
 */
public class HIndex2 {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        int left = 0, right = citations.length;
        int mid = 0, cnt = 0;
        while (left < right) {
            // +1 防止死循环
            mid = (left + right + 1) >> 1;
            cnt = 0;
            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= mid) {
                    cnt++;
                }
            }
            if (cnt >= mid) {
                // 要找的答案在 [mid,right] 区间内
                left = mid;
            } else {
                // 要找的答案在 [0,mid) 区间内
                right = mid - 1;
            }
        }
        return left;
    }
}
