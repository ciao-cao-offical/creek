package cn.ccy.leetcode._2022.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/13 0013
 * @description https://leetcode.cn/problems/one-away-lcci/
 * ☆☆ 做题不可操之过急...
 */
public class OneEditAway {
    public static void main(String[] args) {
        String first = "pale";
        String second = "ple";
        System.out.println(new OneEditAway().oneEditAway(first, second));
    }

    //双指针
    public boolean oneEditAway(String first, String second) {
        int m = first.length();
        int n = second.length();
        if (m - n == 1) {
            return oneInsert(first, second);

        } else if (n - m == 1) {
            return oneInsert(second, first);

        } else if (m == n) {
            boolean diff = false;
            for (int i = 0; i < m; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (!diff) {
                        diff = true;
                    } else {
                        return false;
                    }
                }
            }
            return true;

        } else {
            return false;
        }
    }

    private boolean oneInsert(String longer, String shorter) {
        int l = longer.length();
        int s = shorter.length();
        int il = 0;
        int is = 0;
        while (il < l && is < s) {
            if (longer.charAt(il) == shorter.charAt(is)) {
                is++;
            }
            il++;
            if (il - is > 1) {
                return false;
            }
        }

        return true;
    }
}
