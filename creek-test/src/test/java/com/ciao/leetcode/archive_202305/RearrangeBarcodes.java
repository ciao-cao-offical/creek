package com.ciao.leetcode.archive_202305;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/14 0014 16:35:06
 * @description https://leetcode.cn/problems/distant-barcodes/
 */
public class RearrangeBarcodes {
    public static void main(String[] args) {

    }

    //最大堆
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int barcode : barcodes) {
            if (!count.containsKey(barcode)) {
                count.put(barcode, 1);
            } else {
                count.put(barcode, count.get(barcode) + 1);
            }
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            queue.add(new int[]{entry.getValue(), entry.getKey()});
        }

        int[] res = new int[barcodes.length];
        for (int i = 0; i < barcodes.length; i++) {
            int[] xs = queue.poll();
            if (xs == null) {
                continue;
            }
            int x = xs[1];
            if (i == 0 || res[i - 1] != x) {
                xs[0] -= 1;
                res[i] = x;
                if (xs[0] > 0) {
                    queue.add(xs);
                }

            } else {
                int[] ys = queue.poll();
                if (ys == null) {
                    continue;
                }
                int y = ys[1];
                res[i] = y;
                ys[0] -= 1;
                if (ys[0] > 0) {
                    queue.add(ys);
                }
                queue.add(xs);
            }
        }
        return res;
    }
}
