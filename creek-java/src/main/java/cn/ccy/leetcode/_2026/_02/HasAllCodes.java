package cn.ccy.leetcode._2026._02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-a-string-contains-all-binary-codes-of-size-k/?envType=daily-question&envId=2026-02-23">1461. 检查一个字符串是否包含所有长度为 K 的二进制子串</a>
 * @since 2026/2/23 15:59
 */
public class HasAllCodes {
    public static void main(String[] args) {

    }

    public boolean hasAllCodes(String s, int k) {
        if (s.length() < (1 << k) + k - 1) {
            return false;
        }

        Set<String> exists = new HashSet<String>();
        for (int i = 0; i + k <= s.length(); ++i) {
            exists.add(s.substring(i, i + k));
        }
        return exists.size() == (1 << k);
    }
}
