package cn.ccy.leetcode.archive_202410;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/29 00:05:53
 * @description https://leetcode.cn/problems/generate-binary-strings-without-adjacent-zeros/?envType=daily-question&envId=2024-10-29
 */
public class ValidStrings {
    public static void main(String[] args) {

    }

    List<String> res = new ArrayList<String>();
    int n;

    public List<String> validStrings(int n) {
        this.n = n;
        dfs(new StringBuilder());
        return res;
    }

    public void dfs(StringBuilder sb) {
        if (sb.length() == n) {
            res.add(sb.toString());
        } else {

            if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '1') {
                sb.append('0');
                dfs(sb);
                sb.setLength(sb.length() - 1);
            }
            sb.append('1');
            dfs(sb);
            sb.setLength(sb.length() - 1);
        }
    }
}
