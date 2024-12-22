package cn.ccy.leetcode.archive_2022.archive_202209;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/22 0022
 * @description https://leetcode.cn/problems/check-array-formation-through-concatenation/
 */
public class CanFormArray {
    public static void main(String[] args) {
        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{78}, {4, 64}, {91}};
        System.out.println(new CanFormArray().canFormArray(arr, pieces));
    }

    //哈希表
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int aLen = arr.length;
        int pLen = pieces.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pLen; i++) {
            map.put(pieces[i][0], i);
        }

        for (int i = 0; i < aLen; ) {
            int key = arr[i];
            if (!map.containsKey(key)) {
                return false;
            }

            Integer idx = map.get(key);
            int len = pieces[idx].length;
            for (int j = 0; j < len; j++) {
                if (arr[i + j] != pieces[idx][j]) {
                    return false;
                }
            }
            i += len;
        }
        return true;
    }
}
