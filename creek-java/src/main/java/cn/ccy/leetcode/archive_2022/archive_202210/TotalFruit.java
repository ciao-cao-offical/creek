package cn.ccy.leetcode.archive_2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/17 0017
 * @description https://leetcode.cn/problems/fruit-into-baskets/
 * cvd
 */
public class TotalFruit {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(new TotalFruit().totalFruit(fruits));
    }

    //【滑动窗口】 cvd 烂工作... from：https://leetcode.cn/problems/fruit-into-baskets/solution/by-ac_oier-skgk/
    public int totalFruit(int[] fs) {
        int n = fs.length, ans = 0;
        int[] cnts = new int[n + 10];
        for (int i = 0, j = 0, tot = 0; i < n; i++) {
            if (++cnts[fs[i]] == 1) tot++;
            while (tot > 2) {
                if (--cnts[fs[j++]] == 0) tot--;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
