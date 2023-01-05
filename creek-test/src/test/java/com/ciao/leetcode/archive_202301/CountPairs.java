package com.ciao.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/5 0005 23:15:54
 * @description https://leetcode.cn/problems/count-pairs-with-xor-in-a-range/
 * ★★★★★ 【字典树】，cvd，小瞧这题了...
 */
public class CountPairs {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 7};
        int low = 2;
        int high = 6;
        System.out.println(new CountPairs().countPairs(nums, low, high));
    }

    // 字典树的根节点
    private Trie root = null;
    // 最高位的二进制位编号为 14
    private static final int HIGH_BIT = 14;

    public int countPairs(int[] nums, int low, int high) {
        return f(nums, high) - f(nums, low - 1);
    }

    public int f(int[] nums, int x) {
        root = new Trie();
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            add(nums[i - 1]);
            res += get(nums[i], x);
        }
        return res;
    }

    public void add(int num) {
        Trie cur = root;
        for (int k = HIGH_BIT; k >= 0; k--) {
            int bit = (num >> k) & 1;
            if (cur.son[bit] == null) {
                cur.son[bit] = new Trie();
            }
            cur = cur.son[bit];
            cur.sum++;
        }
    }

    public int get(int num, int x) {
        Trie cur = root;
        int sum = 0;
        for (int k = HIGH_BIT; k >= 0; k--) {
            int r = (num >> k) & 1;
            if (((x >> k) & 1) != 0) {
                if (cur.son[r] != null) {
                    sum += cur.son[r].sum;
                }
                if (cur.son[r ^ 1] == null) {
                    return sum;
                }
                cur = cur.son[r ^ 1];
            } else {
                if (cur.son[r] == null) {
                    return sum;
                }
                cur = cur.son[r];
            }
        }
        sum += cur.sum;
        return sum;
    }

    static class Trie {
        // son[0] 表示左子树，son[1] 表示右子树
        Trie[] son = new Trie[2];
        int sum;

        public Trie() {
            sum = 0;
        }
    }
}
