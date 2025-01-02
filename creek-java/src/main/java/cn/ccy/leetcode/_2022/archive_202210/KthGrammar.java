package cn.ccy.leetcode._2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/20 0020
 * @description https://leetcode.cn/problems/k-th-symbol-in-grammar/
 */
public class KthGrammar {
    public static void main(String[] args) {
        int n = 2, k = 2;
        System.out.println(new KthGrammar().kthGrammar(n, k));
    }

    //【找规律 + 位运算】from：https://leetcode.cn/problems/k-th-symbol-in-grammar/solution/-by-muse-77-zw7u/
    public int kthGrammar(int n, int k) {
        if (k == 1) {
            return 0;
        }

        if (k > (1 << n - 2)) {
            return 1 ^ kthGrammar(n - 1, k - (1 << n - 2));
        }
        return kthGrammar(n - 1, k);
    }
}
