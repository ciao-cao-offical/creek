package cn.ccy.leetcode.archive_2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/22 0022 00:33:23
 * @description https://leetcode.cn/problems/distribute-money-to-maximum-children/?envType=daily-question&envId=2023-09-22
 */
public class DistMoney {
    public static void main(String[] args) {
        System.out.println(new DistMoney().distMoney(20, 3));
    }

    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        money -= children;
        int cnt = Math.min(money / 7, children);
        money -= cnt * 7;
        children -= cnt;
        if ((children == 0 && money > 0) || (children == 1 && money == 3)) {
            cnt--;
        }
        return cnt;
    }
}
