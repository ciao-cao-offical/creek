package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/10
 * @description https://leetcode-cn.com/problems/simplified-fractions/
 */
public class SimplifiedFractions {
    public static void main(String[] args) {
        System.out.println(new SimplifiedFractions().simplifiedFractions(4));
    }

    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for (int denominator = 2; denominator <= n; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (gcb(numerator, denominator) == 1) {
                    ans.add(numerator + "/" + denominator);
                }
            }
        }
        return ans;
    }

    private int gcb(int a, int b) {
        return b != 0 ? gcb(b, a % b) : a;
    }
}
