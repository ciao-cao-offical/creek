package cn.ccy.leetcode._2022.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/4 0004
 * @description https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/
 * ☆☆☆ 基本上算是cvd...哎，思路根本想不到呀... 【约瑟夫环问题】试试【递归】和【迭代】两种实现方式
 */
public class FindTheWinner {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(new FindTheWinner().findTheWinner(n, k));
    }

    //数学 +递归
    public int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (k + findTheWinner(n - 1, k) - 1) % n + 1;
    }
}
