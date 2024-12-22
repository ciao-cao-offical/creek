package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/20
 * @description https://leetcode-cn.com/problems/smallest-good-base/
 * ☆☆☆☆☆ 试试【数学】
 */
public class SmallestGoodBase {
    public static void main(String[] args) {
        String n = "13";
        System.out.println(new SmallestGoodBase().smallestGoodBase(n));
    }

    //枚举len 【宫水三叶】
    public String smallestGoodBase(String n) {
        long m = Long.parseLong(n);
        int max = (int) (Math.log(m) / Math.log(2) + 1);
        for (int len = max; len >= 3; len--) {
            long k = (long) Math.pow(m, 1.0 / (len - 1));
            long res = 0;
            for (int i = 0; i < len; i++) {
                res = res * k + 1;
            }
            if (res == m) {
                return String.valueOf(k);
            }
        }
        return String.valueOf(m - 1);
    }
}
