package cn.ccy.leetcode._2024.archive_202407;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/30 23:23:41
 * @description https://leetcode.cn/problems/double-modular-exponentiation/description/?envType=daily-question&envId=2024-07-30
 * ☆☆☆ 2024cvd
 */
public class GetGoodIndices {
    public static void main(String[] args) {

    }

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < variables.length; i++) {
            int[] v = variables[i];
            if (powMod(powMod(v[0], v[1], 10), v[2], v[3]) == target) {
                ans.add(i);
            }
        }
        return ans;
    }

    public int powMod(int x, int y, int mod) {
        int res = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }
}
