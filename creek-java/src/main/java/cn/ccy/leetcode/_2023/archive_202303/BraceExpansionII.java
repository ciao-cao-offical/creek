package cn.ccy.leetcode._2023.archive_202303;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/7 0007 22:34:45
 * @description https://leetcode.cn/problems/brace-expansion-ii/
 * ★★★
 */
public class BraceExpansionII {
    public static void main(String[] args) {

    }

    private TreeSet<String> s = new TreeSet<>();

    //递归，cvd from https://leetcode.cn/problems/brace-expansion-ii/solutions/2152366/python3javacgotypescript-yi-ti-yi-jie-di-gs64/
    public List<String> braceExpansionII(String expression) {
        dfs(expression);
        return new ArrayList<>(s);
    }

    private void dfs(String exp) {
        int j = exp.indexOf('}');
        if (j == -1) {
            s.add(exp);
            return;
        }
        int i = j;
        while (exp.charAt(i) != '{') {
            --i;
        }
        String a = exp.substring(0, i);
        String c = exp.substring(j + 1);
        for (String b : exp.substring(i + 1, j).split(",")) {
            dfs(a + b + c);
        }
    }
}
