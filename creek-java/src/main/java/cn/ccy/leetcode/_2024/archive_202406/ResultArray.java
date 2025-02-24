package cn.ccy.leetcode._2024.archive_202406;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/5 22:31:04
 * @description https://leetcode.cn/problems/distribute-elements-into-two-arrays-ii/?envType=daily-question&envId=2024-06-05
 * ☆☆☆☆☆ 2024cvd
 */
public class ResultArray {
    public static void main(String[] args) {

    }

    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            index.put(sortedNums[i], i + 1);
        }

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(nums[1]);
        BinaryIndexedTree tree1 = new BinaryIndexedTree(n);
        BinaryIndexedTree tree2 = new BinaryIndexedTree(n);
        tree1.add(index.get(nums[0]));
        tree2.add(index.get(nums[1]));

        for (int i = 2; i < n; i++) {
            int count1 = arr1.size() - tree1.get(index.get(nums[i]));
            int count2 = arr2.size() - tree2.get(index.get(nums[i]));
            if (count1 > count2 || (count1 == count2 && arr1.size() <= arr2.size())) {
                arr1.add(nums[i]);
                tree1.add(index.get(nums[i]));
            } else {
                arr2.add(nums[i]);
                tree2.add(index.get(nums[i]));
            }
        }

        int i = 0;
        for (int a : arr1) {
            nums[i++] = a;
        }
        for (int a : arr2) {
            nums[i++] = a;
        }
        return nums;
    }

    class BinaryIndexedTree {
        private int[] tree;

        public BinaryIndexedTree(int n) {
            tree = new int[n + 1];
        }

        public void add(int i) {
            while (i < tree.length) {
                tree[i]++;
                i += i & -i;
            }
        }

        public int get(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}
