package cn.ccy.leetcode.archive_2023.archive_202310;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/29 0029 22:21:03
 * @description https://leetcode.cn/problems/h-index/?envType=daily-question&envId=2023-10-29
 * ☆☆☆ 试试官解的【计数排序】和【二分搜索】：https://leetcode.cn/problems/h-index/solutions/869042/h-zhi-shu-by-leetcode-solution-fnhl/?envType=daily-question&envId=2023-10-29
 */
public class HIndex {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}
