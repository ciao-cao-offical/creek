package cn.ccy.leetcode._2025._06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/divide-a-string-into-groups-of-size-k/?envType=daily-question&envId=2025-06-22">2138. 将字符串拆分为若干长度为 k 的组</a>
 * @since 2025/6/22 21:01
 */
public class DivideString {
    public static void main(String[] args) {

    }

    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>(); // 分组后的字符串
        int n = s.length();
        int curr = 0; // 每个分组的起始下标
        // 拆分字符串
        while (curr < n) {
            int end = Math.min(curr + k, n);
            res.add(s.substring(curr, end));
            curr += k;
        }
        // 尝试填充最后一组
        String last = res.get(res.size() - 1);
        if (last.length() < k) {
            last += String.valueOf(fill).repeat(k - last.length());
            res.set(res.size() - 1, last);
        }
        return res.toArray(new String[0]);
    }
}
