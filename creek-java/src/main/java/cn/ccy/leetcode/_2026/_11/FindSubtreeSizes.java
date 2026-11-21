package cn.ccy.leetcode._2026._11;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-subtree-sizes-after-changes/?envType=daily-question&envId=2026-11-21">3331. 修改后子树的大小</a>
 * @since 2026/11/21 12:44
 */
public class FindSubtreeSizes {
    public static void main(String[] args) {

    }

    private Map<Integer, List<Integer>> gOld;
    private Map<Character, List<Integer>> records;
    private int[] ans;
    private String s;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        this.s = s;

        this.gOld = new HashMap<>();
        for (int i = 1; i < n; i++) {
            gOld.computeIfAbsent(parent[i], k -> new ArrayList<>()).add(i);
        }

        this.records = new HashMap<>();
        this.ans = new int[n];

        operate(0);
        return ans;
    }

    private void operate(int u) {
        ans[u] += 1;
        records.computeIfAbsent(s.charAt(u), k -> new ArrayList<>()).add(u);
        for (int v : gOld.getOrDefault(u, Collections.emptyList())) {
            operate(v);
            List<Integer> rec = records.getOrDefault(s.charAt(v), Collections.emptyList());
            int uNew = rec.isEmpty() ? u : rec.get(rec.size() - 1);
            ans[uNew] += ans[v];
        }
        List<Integer> r = records.get(s.charAt(u));
        r.remove(r.size() - 1);
    }
}
