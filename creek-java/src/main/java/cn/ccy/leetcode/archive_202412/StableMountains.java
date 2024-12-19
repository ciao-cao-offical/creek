package cn.ccy.leetcode.archive_202412;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/19 21:17:12
 * @description https://leetcode.cn/problems/find-indices-of-stable-mountains/?envType=daily-question&envId=2024-12-19
 */
public class StableMountains {
    public static void main(String[] args) {

    }

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }
}
