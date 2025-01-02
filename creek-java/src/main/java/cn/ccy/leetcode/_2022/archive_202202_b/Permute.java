package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/26
 * @description https://leetcode-cn.com/problems/permutations/
 * ★★
 */
public class Permute {
    private final List<Integer> offer = new ArrayList<>();
    private final List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        List<List<Integer>> permute = new Permute().permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }

    public List<List<Integer>> permute(int[] nums) {
        for (int num : nums) {
            offer.add(num);
        }
        backTrack(0, offer);
        return result;
    }

    private void backTrack(int cur, List<Integer> offer) {
        int size = offer.size();
        if (cur == size) {
            result.add(new ArrayList<>(offer));
        }

        for (int i = cur; i < size; i++) {
            Collections.swap(offer, cur, i);
            backTrack(cur + 1, offer);
            Collections.swap(offer, cur, i);
        }
    }
}
