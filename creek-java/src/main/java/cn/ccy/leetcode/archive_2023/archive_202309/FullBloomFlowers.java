package cn.ccy.leetcode.archive_2023.archive_202309;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/28 22:42
 * @description https://leetcode.cn/problems/number-of-flowers-in-full-bloom/description/?envType=daily-question&envId=2023-09-28
 */
public class FullBloomFlowers {
    public static void main(String[] args) {

    }

    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        TreeMap<Integer, Integer> cnt = new TreeMap<>();
        for (int[] flower : flowers) {
            cnt.put(flower[0], cnt.getOrDefault(flower[0], 0) + 1);
            cnt.put(flower[1] + 1, cnt.getOrDefault(flower[1] + 1, 0) - 1);
        }
        int m = persons.length;
        Integer[] indices = IntStream.range(0, m).boxed().toArray(Integer[]::new);
        Arrays.sort(indices, (i, j) -> persons[i] - persons[j]);
        int[] ans = new int[m];
        int curr = 0;
        for (int x : indices) {
            while (!cnt.isEmpty() && cnt.firstKey() <= persons[x]) {
                curr += cnt.pollFirstEntry().getValue();
            }
            ans[x] = curr;
        }
        return ans;
    }
}
