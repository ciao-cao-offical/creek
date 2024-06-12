package cn.ccy.leetcode.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/12 21:40:32
 * @description https://leetcode.cn/problems/account-balance-after-rounded-purchase/?envType=daily-question&envId=2024-06-12
 */
public class AccountBalanceAfterPurchase {
    public static void main(String[] args) {

    }

    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (purchaseAmount / 10 * 10 + (purchaseAmount % 10 >= 5 ? 10 : 0));
    }
}
