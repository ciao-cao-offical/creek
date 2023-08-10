package cn.ccy.leetcode.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/18
 * @description https://leetcode-cn.com/problems/lexicographical-numbers/
 * ☆☆☆ 试试【迭代】和【递归】
 */
public class LexicalOrder {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(new LexicalOrder().lexicalOrder(n));
    }

    List<Integer> ans = new ArrayList<>();

    //迭代
    public List<Integer> lexicalOrder(int n) {
        for (int i = 0, j = 1; i < n; i++) {
            ans.add(j);
            if (j * 10 <= n) {
                j *= 10;

            } else {
                while (j % 10 == 9 || j + 1 > n) {
                    j /= 10;
                }
                j++;
            }
        }

        return ans;
    }

    //递归 字典树
    /*public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++) {
            dfs(1, n);
        }
        return ans;
    }

    private void dfs(int cur, int limit) {
        if (cur > limit) {
            return;
        }
        ans.add(cur);
        for (int i = 0; i <= 9; i++) {
            dfs(cur * 10 + i, limit);
        }
    }*/
}
