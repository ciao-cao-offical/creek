package cn.ccy.leetcode._2026._02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/special-binary-string/?envType=daily-question&envId=2026-02-20">761. 特殊的二进制字符串</a>
 * @since 2026/2/20 22:29
 * ⭐️⭐️⭐️⭐️⭐️ 2026cvd
 */
public class MakeLargestSpecial {
    public static void main(String[] args) {

    }

    public String makeLargestSpecial(String s) {
        if (s.length() <= 2) {
            return s;
        }
        int cnt = 0, left = 0;
        List<String> subs = new ArrayList<String>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                ++cnt;
            } else {
                --cnt;
                if (cnt == 0) {
                    subs.add("1" + makeLargestSpecial(s.substring(left + 1, i)) + "0");
                    left = i + 1;
                }
            }
        }

        Collections.sort(subs, (a, b) -> b.compareTo(a));
        StringBuilder ans = new StringBuilder();
        for (String sub : subs) {
            ans.append(sub);
        }
        return ans.toString();
    }
}
