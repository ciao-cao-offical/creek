package cn.ccy.leetcode._2025._09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/replace-non-coprime-numbers-in-array/?envType=daily-question&envId=2025-09-16">2197. 替换数组中的非互质数</a>
 * @since 2025/9/16 22:58
 * ★★★★★ 2025cvd
 */
public class ReplaceNonCoprimes {
    public static void main(String[] args) {

    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            while (!ans.isEmpty()) {
                int last = ans.get(ans.size() - 1);
                int g = gcd(last, num);
                if (g > 1) {
                    num = last / g * num;
                    ans.remove(ans.size() - 1);
                } else {
                    break;
                }
            }
            ans.add(num);
        }
        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
