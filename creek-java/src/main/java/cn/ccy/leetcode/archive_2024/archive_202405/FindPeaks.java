package cn.ccy.leetcode.archive_2024.archive_202405;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/28 22:56:17
 * @description https://leetcode.cn/problems/find-the-peaks/?envType=daily-question&envId=2024-05-28
 */
public class FindPeaks {
    public static void main(String[] args) {
        int[] mountain = {1, 4, 3, 8, 5};
        System.out.println(new FindPeaks().findPeaks(mountain));
    }

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }
        return peaks;
    }
}
