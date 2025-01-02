package cn.ccy.leetcode._2023.archive_202308;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/15 0015 00:06:57
 * @description https://leetcode.cn/problems/find-and-replace-in-string/
 * ☆☆☆☆☆ cvd，眼睛里面长针眼了...睡觉了呀，兄弟们...
 */
public class FindReplaceString {
    public static void main(String[] args) {

    }

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length(), m = indices.length;

        List<Integer> ops = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ops.add(i);
        }
        ops.sort((i, j) -> indices[i] - indices[j]);

        StringBuilder ans = new StringBuilder();
        int pt = 0;
        for (int i = 0; i < n; ) {
            while (pt < m && indices[ops.get(pt)] < i) {
                pt++;
            }
            boolean succeed = false;
            while (pt < m && indices[ops.get(pt)] == i) {
                if (s.substring(i, Math.min(i + sources[ops.get(pt)].length(), n)).equals(sources[ops.get(pt)])) {
                    succeed = true;
                    break;
                }
                pt++;
            }
            if (succeed) {
                ans.append(targets[ops.get(pt)]);
                i += sources[ops.get(pt)].length();
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
